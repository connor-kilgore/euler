(ns euler.level1.problem011)

(defn get-grid-value [grid x y]
  (nth (nth grid y) x))

(defn get-right-seq [grid x y]
  (if (>= (+ x 3) (count (first grid)))
    nil
    (map #(get-grid-value grid % y) (take 4 (iterate inc x)))))

(defn get-left-seq [grid x y]
  (if (< (- x 3) 0)
    nil
    (map #(get-grid-value grid % y) (take 4 (iterate dec x)))))

(defn get-down-seq [grid x y]
  (if (>= (+ y 3) (count grid))
    nil
    (map #(get-grid-value grid x %) (take 4 (iterate inc y)))))

(defn get-up-seq [grid x y]
  (if (< (- y 3) 0)
    nil
    (map #(get-grid-value grid x %) (take 4 (iterate dec y)))))

(defn get-right-up-seq [grid x y]
  (if (or (< (- y 3) 0) (>= (+ x 3) (count (first grid))))
    nil
    (map #(get-grid-value grid %1 %2) (take 4 (iterate inc x)) (take 4 (iterate dec y)))))

(defn get-left-up-seq [grid x y]
  (if (or (< (- y 3) 0) (< (- x 3) 0))
    nil
    (map #(get-grid-value grid %1 %2) (take 4 (iterate dec x)) (take 4 (iterate dec y)))))

(defn get-left-down-seq [grid x y]
  (if (or (>= (+ y 3) (count grid)) (< (- x 3) 0))
    nil
    (map #(get-grid-value grid %1 %2) (take 4 (iterate dec x)) (take 4 (iterate inc y)))))

(defn get-right-down-seq [grid x y]
  (if (or (>= (+ y 3) (count grid)) (>= (+ x 3) (count (first grid))))
    nil
    (map #(get-grid-value grid %1 %2) (take 4 (iterate inc x)) (take 4 (iterate inc y)))))

(defn get-largest-seq-product [grid x y]
  (max (reduce * (get-up-seq grid x y))
       (reduce * (get-down-seq grid x y))
       (reduce * (get-left-seq grid x y))
       (reduce * (get-right-seq grid x y))
       (reduce * (get-right-up-seq grid x y))
       (reduce * (get-left-up-seq grid x y))
       (reduce * (get-right-down-seq grid x y))
       (reduce * (get-left-down-seq grid x y))))

(defn euler-11 [grid]
  (reduce max (map #(get-largest-seq-product grid (mod % (count (first grid))) (quot % (count grid)))
                   (take (* (count grid) (count (first grid))) (iterate inc 0)))))

