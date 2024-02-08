(ns euler.level1.problem001)

(defn multiple-of-n? [val n] (if (= val 0) false (zero? (mod val n))))

(defn euler-1 [n]
  (loop [i 1
         sum-of-multiples 0]
    (cond (>= i n) sum-of-multiples
          (or (multiple-of-n? i 3) (multiple-of-n? i 5))
          (recur (inc i) (+ sum-of-multiples i))
          :else (recur (inc i) sum-of-multiples))))