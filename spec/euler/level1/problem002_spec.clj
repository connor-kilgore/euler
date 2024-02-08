(ns euler.level1.problem002-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem002 :refer :all]))

; https://projecteuler.net/problem=2

(describe "Euler Problem #2"

  (it "finds the next value in the fibonnaci sequence and appends to coll"
    (should= nil (append-next-fibonnaci-sequence []))
    (should= nil (append-next-fibonnaci-sequence [1]))
    (should= [1 2 3] (append-next-fibonnaci-sequence [1 2]))
    (should= [1 2 3 5] (append-next-fibonnaci-sequence [1 2 3]))
    (should= [1 2 3 5 8] (append-next-fibonnaci-sequence [1 2 3 5]))
    (should= [1 2 3 5 8 13] (append-next-fibonnaci-sequence [1 2 3 5 8]))
    )

  (it "returns a fibonnaci sequence up to n"
    (should= nil (get-fibonnaci-sequence-to-n 0))
    (should= nil (get-fibonnaci-sequence-to-n -1))
    (should= [1] (get-fibonnaci-sequence-to-n 1))
    (should= [1 2] (get-fibonnaci-sequence-to-n 2))
    (should= [1 2 3] (get-fibonnaci-sequence-to-n 3))
    (should= [1 2 3 5] (get-fibonnaci-sequence-to-n 4))
    (should= [1 2 3 5 8] (get-fibonnaci-sequence-to-n 5))
    (should= [1 2 3 5 8 13 21 34] (get-fibonnaci-sequence-to-n 8))
    )

  (it "Solves #2"
      (should= 0 (euler-2 -1))
      (should= 0 (euler-2 0))
      (should= 0 (euler-2 1))
      (should= 2 (euler-2 2))
      (should= 2 (euler-2 3))
      (should= 44 (euler-2 10))
      (should= 26658145586 (euler-2 50))
      )
  )

(run-specs)
