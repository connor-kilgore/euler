(ns euler.level1.problem012)

(:require Math)

(defn get-num-factors-of-n
  ([n] (if (< n 1) 0 (get-num-factors-of-n n 1 0)))
  ([n i count]
   (cond (> i (Math/sqrt n)) count
         (not (= (mod n i) 0)) (recur n (inc i) count)
         (= (/ n i) i) (recur n (inc i) (inc count))
         :else (recur n (inc i) (+ count 2)))))

(defn has-more-divisors-than-n? [triangle-num n]
  (-> triangle-num
      (get-num-factors-of-n)
      (>= n)))

(defn euler-12
  ([n] (euler-12 2 1 n))
  ([layer triangle-num n]
   (if (has-more-divisors-than-n? triangle-num n)
     triangle-num
     (recur (inc layer) (+ triangle-num layer) n))))
