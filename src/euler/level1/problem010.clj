(ns euler.level1.problem010)

(defn mod-range [divisor values]
      (map #(mod divisor %) values))

(defn prime? [n]
      ; handle less than 1 edge case
      (if (< n 1)
        false
        (empty? (filter zero? (mod-range n (range 2 (inc (int (Math/sqrt (double n)))))))))
      )

(defn euler-10 [n]
  (loop [index 2
         primes []]

    (if (< index n)
      (do
        (if (prime? index)
          (recur (inc index) (conj primes index))
          (recur (inc index) primes)
          )
        )
        (reduce + primes)
      )
  ))
