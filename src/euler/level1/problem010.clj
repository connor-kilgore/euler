(ns euler.level1.problem010)

(defn mod-range [divisor values]
  (map #(mod divisor %) values))

(defn prime? [n]
  (if (< n 1)
    false
    (empty? (filter zero? (mod-range n (range 2 (inc (int (Math/sqrt (double n))))))))))

(defn add-primes-below [n]
  (reduce (fn [acc i] (if (prime? i) (+ acc i) acc)) 0 (range 2 n)))

(defn euler-10 [n]
  (if (< n 1) 0 (add-primes-below n)))
