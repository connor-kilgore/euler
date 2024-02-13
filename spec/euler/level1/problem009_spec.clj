(ns euler.level1.problem009-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem009 :refer :all]))

; https://projecteuler.net/problem=9

(describe "Euler Problem #9"

  (it "checks if 3 values are a pythagorean triplet"
    (should (is-pythagorean-triplet? 3 4 5))
    (should (is-pythagorean-triplet? 5 12 13))
    (should-not (is-pythagorean-triplet? 9 40 40))
    (should-not (is-pythagorean-triplet? 1 1 1)))

  (it "Solves #9"
    (should= 60 (euler-9 12))
    (should= 6240 (euler-9 60))
    (should= 31875000 (euler-9 1000))
    (should= nil (euler-9 500))
    (should= nil (euler-9 1))))

(run-specs)
