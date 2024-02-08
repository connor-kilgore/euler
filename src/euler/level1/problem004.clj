(ns euler.level1.problem004)

(defn is-palindrome? [n]
  (let [str-n (str n)]
    (loop [start-index 0 end-index (- (count str-n) 1)]
      (cond (>= start-index end-index) true
            (not (= (get str-n start-index) (get str-n end-index))) false
            :else (recur (inc start-index) (dec end-index))))))

(defn euler-4 [n]
  (loop [inner-loop-num n
         outer-loop-num n
         largest-multiple 0]
    (let [current-multiple (* inner-loop-num outer-loop-num)]
      (cond (= outer-loop-num 0) largest-multiple
            (= inner-loop-num 0) (recur n (dec outer-loop-num) largest-multiple)
            (and (is-palindrome? current-multiple) (> current-multiple largest-multiple)) (recur (dec inner-loop-num) outer-loop-num current-multiple)
            :else (recur (dec inner-loop-num) outer-loop-num largest-multiple)))))
