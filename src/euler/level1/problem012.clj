(ns euler.level1.problem012)

(defn get-factors [n]
  (filter #(= (mod n %) 0) (range 1 (inc n))))

(defn get-triangle-number-sum [n]
  (apply + (range (inc n))))

(defn has-more-divisors-than-n? [triangle-num n]
  (-> triangle-num
      (get-factors)
      (count)
      (>= n)))

(defn euler-12
  ([n] (euler-12 2 1 n))
  ([next-num triangle-num n]
   (if (has-more-divisors-than-n? triangle-num n)
     triangle-num
     (recur (inc next-num) (+ triangle-num next-num) n))))
