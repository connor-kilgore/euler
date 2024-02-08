(ns euler.level1.problem004)

(defn is-palindrome? [n]
  (cond (<= (count n) 1) true
        (= (first n) (last n)) (is-palindrome? (subs n 1 (dec (count n))))
        :else false))

(defn euler-4 [n]
  (loop [inner-loop-num n
         outer-loop-num n
         largest-multiple 0]
    (let [current-multiple (* inner-loop-num outer-loop-num)]
      (cond (< n 0) nil
            (= outer-loop-num 0) largest-multiple
            (= inner-loop-num 0) (recur n (dec outer-loop-num) largest-multiple)
            (and (is-palindrome? (str current-multiple)) (> current-multiple largest-multiple)) (recur (dec inner-loop-num) outer-loop-num current-multiple)
            :else (recur (dec inner-loop-num) outer-loop-num largest-multiple)))))