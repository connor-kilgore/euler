(ns euler.level1.problem002-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem002 :refer :all]))

; https://projecteuler.net/problem=2

(describe "Euler Problem #2"

  (it "Solves #2"
    (should= 0 (euler-2 -1))
    (should= 0 (euler-2 1))
    (should= 2 (euler-2 2))
    (should= 2 (euler-2 3))
    (should= 26658145586 (euler-2 50))
      )
    )

(run-specs)
