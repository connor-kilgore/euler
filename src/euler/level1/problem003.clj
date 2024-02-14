(ns euler.level1.problem003)

(defn smallest-prime-factor [n]
  (first (filter #(= (mod n %) 0) (range 2 (inc n)))))

(defn largest-prime-factor [n]
  (let [factor (smallest-prime-factor n)]
    (cond (< n 2) nil
          (= factor n) factor
          :else (largest-prime-factor (/ n factor)))))