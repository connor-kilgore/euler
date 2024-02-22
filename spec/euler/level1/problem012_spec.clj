(ns euler.level1.problem012-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem012 :refer :all]))

; https://projecteuler.net/problem=12

(describe "Euler Problem #12"

  (context "gets the factors of n by returning"
    (it "0 with a number less than 1"
      (should= 0 (get-num-factors-of-n 0)))
    (it "a list of each factor of n"
      (should= 1 (get-num-factors-of-n 1))
      (should= 2 (get-num-factors-of-n 2))
      (should= 3 (get-num-factors-of-n 4))))

  (context "gets the first triangle number with n divisors by returning"
    (it "the smallest triangle number with at least n divisors."
      (should= 1 (euler-12 1))
      (should= 3 (euler-12 2))
      (should= 28 (euler-12 5))
      (should= 25200 (euler-12 50))
      (should= 76576500 (euler-12 500)))))

(run-specs)
