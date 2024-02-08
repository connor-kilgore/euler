(ns euler.level1.problem003-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem003 :refer :all]))

; https://projecteuler.net/problem=3

(describe "Euler Problem #3"

  (it "finds smallest prime factor"
      (should= 1 (smallest-prime-factor 1))
      (should= 1 (smallest-prime-factor -1))
      (should= 2 (smallest-prime-factor 10))
      (should= 2 (smallest-prime-factor 4))
      (should= 3 (smallest-prime-factor 9))
      (should= 13 (smallest-prime-factor 13))
      )


  (it "Solves #3"
       (should= 2 (euler-3 4))
       (should= 13 (euler-3 13))
       (should= 5 (euler-3 10))
       (should= 2 (euler-3 2))
       (should= 1 (euler-3 1))
       (should= 1 (euler-3 -1))
       (should= 6857 (euler-3 600851475143))
       )
      )

(run-specs)
