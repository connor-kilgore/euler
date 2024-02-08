(ns euler.level1.problem003)

(defn smallest-prime-factor [n]
      (if (< n 2)
        1
        (loop [factor 2]
          (if (= (mod n factor) 0)
            factor
            (recur (inc factor))))))

(defn euler-3 [n]
      (loop [n n
             largest-factor-of-n 1]
        (if-not (> n 1)
          largest-factor-of-n
          (let [factor (smallest-prime-factor n)]
            (recur (/ n factor) factor)))))