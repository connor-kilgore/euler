(ns euler.level1.problem005-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem005 :refer :all]))

; https://projecteuler.net/problem=5

(describe "Euler Problem #5"

 (it "moves index 1 integer closer to n"
     (should= 2 (move-index-towards-n 1 2))
     (should= 2 (move-index-towards-n 1 3))
     (should= 3 (move-index-towards-n 2 3))
     (should= 1 (move-index-towards-n 2 1))
     (should= 1 (move-index-towards-n 2 -1))
     (should= 999 (move-index-towards-n 1000 0))
     )

  (it "checks if a number is divisible by another number"
      (should (divisible-by-num? 1 1))
      (should-not (divisible-by-num? 1 2))
      (should (divisible-by-num? 2 2))
      (should (divisible-by-num? 2 0))
      (should (divisible-by-num? 0 2))
      (should-not (divisible-by-num? -1 2))
      (should (divisible-by-num? 2 -1))
      (should (divisible-by-num? 493024932 2))
      )

  (it "checks if number is divisible by 1-n numbers"
      (should (is-divisible-by-n-nums? 1 1))
      (should (is-divisible-by-n-nums? 2 2))
      (should-not (is-divisible-by-n-nums? 3 2))
      (should-not (is-divisible-by-n-nums? 4 4))
      (should-not (is-divisible-by-n-nums? 1 3))
      (should-not (is-divisible-by-n-nums? -1 3))
      (should (is-divisible-by-n-nums? 2520 10))
      )

  (it "Solves #5"
    (should= 1 (euler-5 1))
    (should= 2 (euler-5 2))
    (should= 6 (euler-5 3))
    (should= 12 (euler-5 4))
    (should= 2520 (euler-5 10))
    (should= 1 (euler-5 -1))
    (should= 232792560 (euler-5 20))
      )
  )

(run-specs)
