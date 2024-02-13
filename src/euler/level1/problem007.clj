(ns euler.level1.problem007)

(defn mod-range [divisor values]
  (map #(mod divisor %) values))

(defn prime? [n]
  (if (< n 1)
    false
    (empty? (filter zero? (mod-range n (range 2 (inc (int (Math/sqrt (double n))))))))))

(defn find-next-prime [n]
  (if (prime? (inc n)) (inc n) (find-next-prime (inc n))))

(defn euler-7 [n]
  (cond (< n 1) 0
        :else (last (take n (iterate find-next-prime 2)))))
