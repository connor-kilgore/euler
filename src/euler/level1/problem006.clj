(ns euler.level1.problem006)

(defn square-list [n]
      (* n n))

(defn square-of-sums [n]
      (* (reduce + (range (inc n))) (reduce + (range (inc n)))))

(defn sum-of-squares [n]
      (reduce + (map square-list (range (inc n)))))

(defn euler-6 [n]
      (- (square-of-sums n) (sum-of-squares n))
  )
