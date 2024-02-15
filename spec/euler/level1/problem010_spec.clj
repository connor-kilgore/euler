(ns euler.level1.problem010-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem010 :refer :all]))

; https://projecteuler.net/problem=10

(describe "Euler Problem #10"

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

  (it "adds all prime numbers below n"
    (should= 0 (add-primes-below 1))
    (should= 0 (add-primes-below 2))
    (should= 0 (add-primes-below -1))
    (should= 17 (add-primes-below 10)))

  (it "Solves #10"
    (should= 17 (euler-10 10))
    (should= 2 (euler-10 3))
    (should= 0 (euler-10 2))
    (should= 0 (euler-10 -1))
    (should= 41 (euler-10 15))
    (should= 76127 (euler-10 1000))
    #_(should= 142913828922 (euler-10 2000000))))

(run-specs)
