(ns euler.level1.problem002)

(defn append-next-fibonnaci-sequence [n]
  (if (< (count n) 2) nil (conj n (+ (last n) (nth n (- (count n) 2))))))

(defn get-fibonnaci-sequence-to-n [n]
  (if (< n 3)
    (range 1 (inc n))
    (last (take (dec n) (iterate append-next-fibonnaci-sequence [1 2])))))

(defn euler-2 [n]
  (reduce (fn [sum f-number] (if (even? f-number) (+ sum f-number) sum))
          0 (get-fibonnaci-sequence-to-n n)))