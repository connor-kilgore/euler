(ns euler.level1.problem006-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem006 :refer :all]))

; https://projecteuler.net/problem=6

(describe "Euler Problem #6"

          (it "returns a list with each value squared"
          (should= '(0) (map square-list (range 1)))
          (should= '(0, 1) (map square-list (range 2)))
          (should= '(0, 1, 4) (map square-list (range 3)))
          (should= '() (map square-list (range -1)))
          (should= '(0, 1, 4, 9, 16) (map square-list (range 5)))
              )

          (it "gives the square of the sums"
          (should= 1 (square-of-sums 1))
          (should= 9 (square-of-sums 2))
          (should= 36 (square-of-sums 3))
          (should= 3025 (square-of-sums 10))
          )

          (it "gives the sum of the squares"
          (should= 1 (sum-of-squares 1))
          (should= 5 (sum-of-squares 2))
          (should= 14 (sum-of-squares 3))
          (should= 385 (sum-of-squares 10))
          (should= 0 (sum-of-squares -1))
          )


          (it "Solves #6"
          (should= 0 (euler-6 1))
          (should= 4 (euler-6 2))
          (should= 22 (euler-6 3))
          (should= 2640 (euler-6 10))
          (should= 0 (euler-6 -1))
          (should= 0 (euler-6 -10))
          (should= 25164150 (euler-6 100))
          )
        )

(run-specs)
