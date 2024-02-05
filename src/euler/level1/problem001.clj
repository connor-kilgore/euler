(ns euler.level1.problem001)

(defn multiple-of-3? [n]
      (if (= n 0)
        false
        (= (mod n 3) 0))
      )

(defn multiple-of-5? [n]
      (if (= n 0)
        false
        (= (mod n 5) 0))
      )

(defn euler-1 [n]
      (loop [index 1
             addedVal 0]

            (if (< index n)
              (do
                (if (or (multiple-of-3? index) (multiple-of-5? index))
                  (recur (inc index) (+ addedVal index))
                  (recur (inc index) addedVal)
                )
              )
              addedVal)
      )
  )