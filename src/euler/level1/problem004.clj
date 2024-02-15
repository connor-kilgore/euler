(ns euler.level1.problem004)

(defn is-palindrome? [n]
  (cond (<= (count (str n)) 1) true
        (= (first (str n)) (last (str n))) (is-palindrome? (subs (str n) 1 (dec (count (str n)))))
        :else false))

(defn get-next-palindrome [n]
  (if (is-palindrome? (str n)) n (get-next-palindrome (inc n))))

(defn euler-4 [n]
  (if (zero? n)
    0
    (reduce max (filter is-palindrome? (map #(* (inc (mod % n)) (inc (quot % n))) (take (* n n) (iterate inc 0)))))))