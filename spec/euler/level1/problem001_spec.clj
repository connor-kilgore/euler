(ns euler.level1.problem001-spec
  (:use
    [speclj.core]
    [euler.level1.problem001 :as sut]))

; http://projecteuler.net/index.php?section=problems&id=1

(describe "how it sums all multiples of 3 and 5 up to n"

  (it "checks if it is a multiple of 3"
    (should-not (sut/multiple-of-n? 0 3))
    (should-not (sut/multiple-of-n? 1 3))
    (should (sut/multiple-of-n? 3 3))
    (should (sut/multiple-of-n? 6 3))
    (should-not (sut/multiple-of-n? -1 3))
    (should (sut/multiple-of-n? -3 3)))

  (it "checks if it is a multiple of 5"
    (should-not (sut/multiple-of-n? 0 5))
    (should-not (sut/multiple-of-n? 1 5))
    (should (sut/multiple-of-n? 5 5))
    (should (sut/multiple-of-n? 10 5))
    (should-not (sut/multiple-of-n? -3 5))
    (should (sut/multiple-of-n? -5 5)))

  (it "gets a lazy sequence up to n and sums all the multiples of 3 or 5 together"
    (should= 0 (euler-1 0))
    (should= 3 (euler-1 4))
    (should= 8 (euler-1 6))
    (should= 0 (euler-1 -1))
    (should= 233168 (euler-1 1000)))
  )

(run-specs)