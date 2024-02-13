(ns euler.level1.problem007-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem007 :refer :all]))

; https://projecteuler.net/problem=7

(describe "Euler Problem #7"

  (it "mods each value in a supplied coll and returns that as a coll"
    (should= '(0 2 2) (mod-range 2 (range 2 5)))
    (should= '() (mod-range 2 (range 2 2)))
    (should= '(2) (mod-range 2 (range 3 4))))

  (it "checks if n is a prime number"
    (should (prime? 1))
    (should (prime? 2))
    (should-not (prime? 4))
    (should-not (prime? -1))
    (should-not (prime? 0))
    (should (prime? 17)))

  (it "finds the next prime number after n"
    (should= 2 (find-next-prime 1))
    (should= 3 (find-next-prime 2))
    (should= 1 (find-next-prime -1))
    (should= 5 (find-next-prime 3)))

  (it "Solves #7"
    (should= 2 (euler-7 1))
    (should= 0 (euler-7 0))
    (should= 0 (euler-7 -1))
    (should= 104743 (euler-7 10001))))

(run-specs)
