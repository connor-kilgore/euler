(ns euler.level1.problem006)

(defn square [n]
      (* n n))

(defn square-of-sums [n]
  (square (reduce + (range (inc n)))))

(defn sum-of-squares [n]
      (reduce + (map square (range (inc n)))))

(defn euler-6 [n]
      (- (square-of-sums n) (sum-of-squares n)))
