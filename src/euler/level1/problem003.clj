(ns euler.level1.problem003)

(defn smallest-prime-factor [n]
      ; handle edge cases
      (if (< n 2)
        1
        (do
          (loop [factor 2]
                (if (= (mod n factor) 0)
                  factor
                  (recur (inc factor)))
                )
          )
        )
      )

(defn euler-3 [n]
      (loop [n n
             largestFactor 1]
            (if (> n 1)
              (do
                (recur (/ n (smallest-prime-factor n)) (smallest-prime-factor n))
                )
              largestFactor))

      )
