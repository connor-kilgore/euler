(ns euler.level1.problem012-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem012 :refer :all]))

; https://projecteuler.net/problem=12

(describe "Euler Problem #12"

  (context "gets the nth triangle number by returning"
    (it "the sum of the range of n + 1"
      (should= 1 (get-triangle-number-sum 1))
      (should= 6 (get-triangle-number-sum 3))))

  (context "gets the factors of n by returning"
    (it "an empty list with a number less than 1"
      (should= [] (get-factors 0)))
    (it "a list of each factor of n"
      (should= [1] (get-factors 1))
      (should= [1 2] (get-factors 2))
      (should= [1 2 4] (get-factors 4))))

  (context "gets the first triangle number with n divisors by returning"
    (it "the smallest triangle number with at least n divisors."
      (should= 1 (euler-12 1))
      (should= 3 (euler-12 2))
      (should= 28 (euler-12 5))
      (should= 25200 (euler-12 50)))))

(run-specs)
