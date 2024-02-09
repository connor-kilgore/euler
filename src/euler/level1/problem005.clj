(ns euler.level1.problem005)

(defn get-smallest-prime-factor [n]
  (first (filter (fn [x] (= (mod n x) 0)) (range 2 (inc n)))))

(defn prime-factors [n]
  (loop [n n
         factors []]
    (let [factor (get-smallest-prime-factor n)]
      (if (= factor nil) factors (recur (/ n factor) (conj factors factor))))))

(defn merge-maps-with-highest-values [map1 map2]
  (merge-with #(if (> %1 %2) %1 %2) map1 map2)
  )

(defn get-map-of-frequencies-of-factors [n]
  (map frequencies (map prime-factors (range 2 (inc n))))
  )

(defn get-map-with-highest-frequency-vals [n]
  (reduce merge-maps-with-highest-values (get-map-of-frequencies-of-factors n)))

(defn euler-5 [n]
  (cond (< n 1) nil
        (< n 2) n
        :else (reduce * (for [[key value] (get-map-with-highest-frequency-vals n)] (int (Math/pow key value))))
        ))