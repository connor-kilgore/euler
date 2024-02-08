(ns euler.level1.problem001)

(defn multiple-of-n? [val n] (if (= val 0) false (zero? (mod val n))))

(defn euler-1 [n]
  (reduce (fn [sum i] (if (or (multiple-of-n? i 3) (multiple-of-n? i 5)) (+ sum i) sum))
    0 (range n)))