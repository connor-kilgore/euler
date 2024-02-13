(ns euler.level1.problem005-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem005 :refer :all]))

; https://projecteuler.net/problem=5

(describe "how a list of prime factors are retrieved 1-n and they are
merged with the highest frequency of values overwriting."

  (it "will return a prime number input"
    (should= 2 (get-smallest-prime-factor 2))
    (should= 3 (get-smallest-prime-factor 3)))
  (it "will return nil for a number less than 2"
    (should= nil (get-smallest-prime-factor 1))
    (should= nil (get-smallest-prime-factor 0)))
  (it "will return the smallest factor of a non-prime integer"
    (should= 2 (get-smallest-prime-factor 4))
    (should= 2 (get-smallest-prime-factor 10)))

  (it "will return a map with both maps merged, overwriting the highest values"
    (should= {2 2} (marge-maps-by-higher-frequency {2 1} {2 2}))
    (should= {2 2, 3 1} (marge-maps-by-higher-frequency {2 1, 3 1} {2 2}))
    (should= {2 2, 3 2} (marge-maps-by-higher-frequency {2 1, 3 2} {2 2, 3 1}))
    )

  (it "will merge all the maps together into 1 of highest frequency of each key"
    (should= {2 1} (get-map-of-highest-frequency 2))
    (should= {2 2, 3 1, 5 1} (get-map-of-highest-frequency 5))
    (should= {2 3, 3 2, 5 1, 7 1} (get-map-of-highest-frequency 10))
    )

  (it "will return numbers if single prime numbers"
    (should= [2] (prime-factors 2))
    (should= [3] (prime-factors 3))
    (should= [13] (prime-factors 13)))
  (it "will return nil for numbers less than 2"
    (should= [] (prime-factors 1))
    (should= [] (prime-factors 0)))

  (it "will return every prime factor of non-primes"
    (should= [2 3] (prime-factors 6))
    (should= [2 5] (prime-factors 10))
    (should= [2 2 5] (prime-factors 20))
    )

  (it "will return a list of maps stating the frequency of each factor from 1-n"
    (should= '({2 1}) (get-map-of-frequencies-of-factors 2))
    (should= '({2 1} {3 1} {2 2} {5 1}) (get-map-of-frequencies-of-factors 5))
    (should= '() (get-map-of-frequencies-of-factors 0))
    (should= '({2 1} {3 1} {2 2} {5 1} {2 1 3 1} {7 1} {2 3} {3 2} {2 1 5 1}) (get-map-of-frequencies-of-factors 10))
    )

  (it "Will return value if 1 or 2 is entered"
    (should= 1 (euler-5 1))
    (should= 2 (euler-5 2))
    )

  (it "Will return nil if value below 1"
    (should= nil (euler-5 0))
    (should= nil (euler-5 -1))
    )

  (it "Will return smallest integer divisible by all 1-n if otherwise"
    (should= 1 (euler-5 1))
    (should= 2 (euler-5 2))
    (should= nil (euler-5 -1))
    (should= 6 (euler-5 3))
    (should= 2520 (euler-5 10))
    (should= 232792560 (euler-5 20))
    )
  )

(run-specs)