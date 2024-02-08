(ns euler.level1.problem005)

(defn move-index-towards-n [index n]
      (if (< index n)
        (inc index)
        (if (> index n) (dec index) index)
        ))

(defn divisible-by-num? [numerator denominator]
      ; skip 0-denominator by returning true
      (if (= denominator 0)
        true
        (= (mod numerator denominator) 0)))


(defn is-divisible-by-n-nums? [number n]
      (loop [index 0]
        (if (divisible-by-num? number index)
          (if (= index n)
            true
            (recur (move-index-towards-n index n)))
          false)))

(defn euler-5 [n]
  (loop [index 1]
    (if (is-divisible-by-n-nums? index n)
      index
      (recur (inc index)))))
