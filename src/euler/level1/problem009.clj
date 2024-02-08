(ns euler.level1.problem009)

(defn is-pythagorean-triplet? [a b c]
  (and (and (< a b) (< b c)) (= (+ (* a a) (* b b)) (* c c)))
)

(defn euler-9 [n]
  (loop [a 1
         b (+ a 1)]

    (let [c (- n a b)]
      (if (is-pythagorean-triplet? a b c)
        (* a b c)
        (do
          (if (< b (quot (- n a) 2))
            (recur a (inc b))
            (do
              (if (< a (quot n 3))
                (recur (inc a) (+ a 2))
                nil
                )
              )
            )
          )
        ))
    )
)