(ns euler.level1.problem003)

(defn smallest-prime-factor [n]
  (loop [factor 2]
    (cond (< n 2) 1
          (= (mod n factor) 0) factor
          :else (recur (inc factor)))))

(defn euler-3 [n]
  (loop [n n
         largest-factor-of-n 1]
    (if-not (> n 1)
      largest-factor-of-n
      (let [factor (smallest-prime-factor n)]
        (recur (/ n factor) factor)))))