(ns euler.level1.problem007-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem007 :refer :all]))

; https://projecteuler.net/problem=7

(describe "Euler Problem #7"

  (it "checks if n is a prime number"
    (should (prime? 1))
    (should (prime? 2))
    (should (prime? 3))
    (should-not (prime? 4))
    (should-not (prime? -1))
    (should-not (prime? 0))
    (should (prime? 17))
    )

  (it "Solves #7"
    (should= 2 (euler-7 1))
    (should= 3 (euler-7 2))
    (should= 5 (euler-7 3))
    (should= 7 (euler-7 4))
    (should= 0 (euler-7 0))
    (should= 0 (euler-7 -1))
    (should= 541 (euler-7 100))
    (should= 7919 (euler-7 1000))
    (should= 104743 (euler-7 10001))
    )
  )

(run-specs)
