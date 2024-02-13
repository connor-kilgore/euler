(ns euler.level1.problem004-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem004 :refer :all]))

; https://projecteuler.net/problem=4

(describe "how it finds the highest palindromic integer that is a multiple of
two integers 1-n"

  (it "checks if number is a palindrome"
    (should (is-palindrome? "1"))
    (should (is-palindrome? "121"))
    (should (is-palindrome? "1221"))
    (should-not (is-palindrome? "122"))
    (should-not (is-palindrome? "12231221")))

  (it "checks if n is a larger palindromic factor than largest-factor"
    (should (largest-palindromic-factor? 2 1))
    (should-not (largest-palindromic-factor? 12 1))
    (should (largest-palindromic-factor? 121 1))
    (should-not (largest-palindromic-factor? 121 1221)))

  (it "loops through each combination of multiples 1-n and returns
  the highest palindromic product"
    (should= 1 (euler-4 1))
    (should= 4 (euler-4 2))
    (should= 9 (euler-4 3))
    (should= nil (euler-4 -1))
    (should= 0 (euler-4 0))
    (should= 9009 (euler-4 99))
    (should= 906609 (euler-4 999))))

(run-specs)
