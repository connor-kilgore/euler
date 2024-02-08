(ns euler.level1.problem004-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem004 :refer :all]))

; https://projecteuler.net/problem=4

(describe "Euler Problem #4"

  (it "checks if number is a palindrome"
    (should (is-palindrome? 1))
    (should (is-palindrome? 2))
    (should (is-palindrome? 121))
    (should (is-palindrome? 12321))
    (should (is-palindrome? 123321))
    (should-not (is-palindrome? 122))
    (should-not (is-palindrome? 12231221))
    (should-not (is-palindrome? 12))
    )

  (it "Solves #4"
    (should= 9009 (euler-4 99))
    (should= 906609 (euler-4 999))
    (should= 9 (euler-4 10))
    (should= 1 (euler-4 1))
    )
  )

(run-specs)
