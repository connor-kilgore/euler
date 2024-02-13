(ns euler.level1.problem003-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem003 :refer :all]))

; https://projecteuler.net/problem=3

(describe "How it finds the largest prime-factor of a number"
  (it "returns the input if given a prime number"
    (should= 2 (smallest-prime-factor 2))
    (should= 3 (smallest-prime-factor 3)))
  (it "returns nil if given a number with no prime factors"
    (should= nil (smallest-prime-factor 1)))
  (it "returns the smallest prime factor if given a non-prime valid integer"
    (should= 2 (smallest-prime-factor 4)))

  (it "returns the input if given a prime number"
    (should= 2 (largest-prime-factor 2))
    (should= 3 (largest-prime-factor 3)))
  (it "returns nil if given a number with no prime factors"
    (should= nil (largest-prime-factor 1)))
  (it "returns the largest prime factor if given a non-prime valid integer"
    (should= 2 (largest-prime-factor 4))
    (should= 3 (largest-prime-factor 6))
    (should= 138571 (largest-prime-factor 9403289489))))

(run-specs)
