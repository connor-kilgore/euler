(ns euler.level1.problem006-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem006 :refer :all]))

; https://projecteuler.net/problem=6

(describe "Euler Problem #6"

  (it "returns a value squared"
    (should= 1 (square 1))
    (should= 4 (square 2)))

  (it "returns a each value in a list squared"
    (should= '(0) (map square (range 1)))
    (should= '(0, 1) (map square (range 2)))
    (should= '(0, 1, 4) (map square (range 3)))
    (should= '() (map square (range -1))))

  (it "gives the square of the sums"
    (should= 1 (square-of-sums 1))
    (should= 9 (square-of-sums 2)))

  (it "gives the sum of the squares"
    (should= 1 (sum-of-squares 1))
    (should= 5 (sum-of-squares 2)))

  (it "returns the difference between the square of sums and
          the sum of squares"
    (should= 0 (euler-6 1))
    (should= 22 (euler-6 3))
    (should= 2640 (euler-6 10))
    (should= 0 (euler-6 -1))
    (should= 25164150 (euler-6 100))))

(run-specs)
