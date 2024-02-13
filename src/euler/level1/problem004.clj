(ns euler.level1.problem004)

(defn is-palindrome? [n]
  (cond (<= (count n) 1) true
        (= (first n) (last n)) (is-palindrome? (subs n 1 (dec (count n))))
        :else false))

(defn largest-palindromic-factor? [n largest-factor]
  (and (is-palindrome? (str n)) (> n largest-factor))
  )

(defn euler-4 [n]
  (loop [inner n
         outer n
         largest-factor 0]
    (let [factor (* inner outer)]
      (cond (< n 0) nil
            (= outer 0) largest-factor
            (= inner 0) (recur (dec outer) (dec outer) largest-factor)
            (largest-palindromic-factor? factor largest-factor) (recur (dec inner) outer factor)
            :else (recur (dec inner) outer largest-factor)))))