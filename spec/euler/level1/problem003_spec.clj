(ns euler.level1.problem003-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem003 :refer :all]))

; https://projecteuler.net/problem=3

(describe "How it finds the largest prime-factor of a number"

  (it "finds smallest prime factor"
    (should= 1 (smallest-prime-factor 1))
    (should= 1 (smallest-prime-factor -1))
    (should= 2 (smallest-prime-factor 10))
    (should= 2 (smallest-prime-factor 4))
    (should= 3 (smallest-prime-factor 9))
    (should= 13 (smallest-prime-factor 13)))


  (it "chops off the smallest prime factor from n until the remainder is the
  largest prime-factor"
    (should= 1 (euler-3 0))
    (should= 1 (euler-3 1))
    (should= 1 (euler-3 -1))
    (should= 2 (euler-3 2))
    (should= 2 (euler-3 4))
    (should= 5 (euler-3 10))
    (should= 13 (euler-3 13))
    (should= 6857 (euler-3 600851475143))))

(run-specs)
