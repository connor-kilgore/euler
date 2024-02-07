(ns euler.level1.problem008)

(defn product-of-vector [vec]
  (reduce * vec)
)

(defn out-of-bounds? [n position sub-size]
  (< (count n) (+ position sub-size))
)

(defn euler-8 [n sub-size]
  (if (out-of-bounds? n 0 sub-size)
    nil
    (do
      (loop [index 1
             max-product (product-of-vector(subvec n 0 sub-size))]

        (if (out-of-bounds? n index sub-size)
          max-product
          (do
            (def new-product (product-of-vector (subvec n index (+ index sub-size))))
            (if (> new-product max-product)
              (recur (inc index) new-product)
              (recur (inc index) max-product)
            )
          )
        )
      )
    )
  )
)
