(ns euler.level1.problem008)

(defn product-of-vector [vec] (reduce * vec))

(defn out-of-bounds? [n position sub-size] (< (count n) (+ position sub-size)))

(defn get-lazyseq-products [n position sub-size]
  (if (out-of-bounds? n position sub-size)
    []
    (let [product (product-of-vector (subvec n position (+ position sub-size)))]
      (conj (get-lazyseq-products n (inc position) sub-size) product))))

(defn euler-8 [n sub-size]
  (let [products (get-lazyseq-products n 0 sub-size)]
    (if (empty? products) nil (apply max (get-lazyseq-products n 0 sub-size)))))
