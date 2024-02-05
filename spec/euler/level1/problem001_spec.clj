(ns euler.level1.problem001-spec
    (:use
      [speclj.core]
      [euler.level1.problem001 :as sut]))

; http://projecteuler.net/index.php?section=problems&id=1

(describe "Euler Problem #1"

          (it "is a multiple of 3"
              (should-not (sut/multiple-of-3? 0))
              (should-not (sut/multiple-of-3? 1))
              (should-not (sut/multiple-of-3? 2))
              (should (sut/multiple-of-3? 3))
              (should-not (sut/multiple-of-3? 4))
              (should-not (sut/multiple-of-3? 5))
              (should (sut/multiple-of-3? 6))
              )

          (it "is a multiple of 5"
              (should-not (sut/multiple-of-5? 0))
              (should-not (sut/multiple-of-5? 1))
              (should-not (sut/multiple-of-5? 2))
              (should-not (sut/multiple-of-5? 3))
              (should-not (sut/multiple-of-5? 4))
              (should (sut/multiple-of-5? 5))
              (should-not (sut/multiple-of-5? 6))
              (should-not (sut/multiple-of-5? 7))
              (should (sut/multiple-of-5? 10))
              )

          (it "Solves #1"
             (should= 0 (euler-1 0))
             (should= 0 (euler-1 3))
             (should= 3 (euler-1 4))
             (should= 8 (euler-1 6))
             (should= 0 (euler-1 -1))
             (should= 23 (euler-1 10))
             (should= 233168 (euler-1 1000))
             ))

(run-specs)