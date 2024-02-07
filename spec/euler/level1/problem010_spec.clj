(ns euler.level1.problem010-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem010 :refer :all]))

; https://projecteuler.net/problem=10

(describe "Euler Problem #10"

  (it "checks if n is a prime number"
    (should (prime? 1))
    (should (prime? 2))
    (should (prime? 3))
    (should-not (prime? 4))
    (should-not (prime? -1))
    (should-not (prime? 0))
    (should (prime? 17))
  )

  (it "Solves #10"
    (should= 17 (euler-10 10))
    (should= 2 (euler-10 3))
    (should= 0 (euler-10 2))
    (should= 0 (euler-10 -1))
    (should= 41 (euler-10 15))
    (should= 76127 (euler-10 1000))
      ; takes a while to run, leave commented out normally
      ;(should= 142913828922 (euler-10 2000000))
    )
)

(run-specs)
