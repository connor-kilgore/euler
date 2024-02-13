(ns euler.level1.problem002-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem002 :refer :all]))

; https://projecteuler.net/problem=2

(describe "how it sums the even numbers in a Fibonnaci sequence up to n layers"

  (it "returns nil if supplied vector is too small"
    (should= nil (append-next-fibonnaci-sequence []))
    (should= nil (append-next-fibonnaci-sequence [1])))
  (it "finds the next fibonnaci number in the sequence"
    (should= [1 2 3] (append-next-fibonnaci-sequence [1 2]))
    (should= [1 2 3 5] (append-next-fibonnaci-sequence [1 2 3])))

  (it "returns nil if given invalid n"
    (should= nil (get-fibonnaci-sequence-to-n 0))
    (should= nil (get-fibonnaci-sequence-to-n -1)))
  (it "returns fibonacci sequence up to n if given a valid n"
    (should= [1] (get-fibonnaci-sequence-to-n 1))
    (should= [1 2] (get-fibonnaci-sequence-to-n 2))
    (should= [1 2 3] (get-fibonnaci-sequence-to-n 3))
    (should= [1 2 3 5 8 13 21 34] (get-fibonnaci-sequence-to-n 8)))

  (it "returns a sum of 0 if given an invalid n for layers of the sequence"
    (should= 0 (euler-2 -1))
    (should= 0 (euler-2 0)))
  (it "returns a sum of even integers up to n layers of the fibonacci sequence"
    (should= 0 (euler-2 1))
    (should= 2 (euler-2 2))
    (should= 2 (euler-2 3))
    (should= 44 (euler-2 10))
    (should= 26658145586 (euler-2 50))))

(run-specs)
