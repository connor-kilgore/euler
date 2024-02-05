(ns euler.level1.problem002)

(defn euler-2 [n]
      ; loop up to n starting with firstVal at 1 and secVal at 2
      (loop [index 2
             totalEven 0
             firstVal 1
             secVal 2]

            (if (> index n)
              totalEven
            (do
              ;; check if secVal is even
              (if (even? secVal)
                ;; recur with totalEven increased
                (recur (inc index) (+ totalEven secVal) secVal (+ firstVal secVal))
                ;; recur without totalEven increased
                (recur (inc index) totalEven secVal (+ firstVal secVal))
                )
              )
            )
          )
  )
