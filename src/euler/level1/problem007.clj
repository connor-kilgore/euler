(ns euler.level1.problem007)

(defn mod-range [divisor values]
      (map #(mod divisor %) values))

(defn prime? [n]
      ; handle less than 1 edge case
      (if (< n 1)
        false
        (empty? (filter zero? (mod-range n (range 2 (inc (int (Math/sqrt (double n)))))))))
      )

(defn euler-7 [n]
      (if (< n 1)
        0
        (do
          (loop [index 2
                 count 0]

                (if (>= count n)
                  (dec index)
                  (if (prime? index) (recur (inc index) (inc count)) (recur (inc index) count))
                )))))
