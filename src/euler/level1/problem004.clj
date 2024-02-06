(ns euler.level1.problem004)

(defn is-palindrome? [n]
      ;convert number to a string
      (def str-n (str n))

      ; loop start-index and end-index to the middle of the str
      (loop [start-index 0
             end-index (- (count str-n) 1)]

            ; check if start has reached or passed end
            (if (>= start-index end-index)
              true
              (do
                ; check if start-index char doesn't match end-index char
                (if (not (= (get str-n start-index) (get str-n end-index)))
                  false
                  (recur (inc start-index) (dec end-index))
                  )
                )
              )
            )
  )

(defn euler-4 [n]
      ; loop through each possible combination of two nums <= n
      (loop [numOne n
             numTwo n
             largestMultiple 0]
            ;check if numTwo is 0
            (if (= numTwo 0)
              largestMultiple
              (do
                ; check if numOne is 0
                (if (= numOne 0)
                  (recur n (dec numTwo) largestMultiple)
                  ; both numOne and numTwo > 0
                  (do
                    ; check if numOne and numTwo multiplied are a palindrome
                    (if (is-palindrome? (* numOne numTwo))
                      (do
                        ; check if their multiple is the new largest
                        (if (> (* numOne numTwo) largestMultiple)
                          (recur (dec numOne) numTwo (* numOne numTwo))
                          (recur (dec numOne) numTwo largestMultiple)
                          )
                        )
                      (recur (dec numOne) numTwo largestMultiple)
                      )
                    )
                )
              )
            )
          )
  )
