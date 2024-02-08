(ns euler.level1.problem002)

(defn euler-2 [n]
  (loop [index 2 totalEven 0 firstVal 1 secVal 2]
    (cond (> index n) totalEven
          (even? secVal) (recur (inc index) (+ totalEven secVal) secVal (+ firstVal secVal))
          :else (recur (inc index) totalEven secVal (+ firstVal secVal)))))