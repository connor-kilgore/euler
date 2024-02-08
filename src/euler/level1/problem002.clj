(ns euler.level1.problem002)

(defn append-next-fibonnaci-sequence [n]
  (if (< (count n) 2) nil (conj n (+ (last n) (nth n (- (count n) 2))))))

(defn get-fibonnaci-sequence-to-n [n]
  (cond (< n 1) nil
        (< n 3) (range 1 (inc n))
        :else (loop [f-sequence [1 2]]
          (if (>= (count f-sequence) n)
            f-sequence (recur (append-next-fibonnaci-sequence f-sequence))))))

(defn euler-2 [n]
  (reduce (fn [sum f-number] (if (even? f-number) (+ sum f-number) sum))
          0 (get-fibonnaci-sequence-to-n n)))