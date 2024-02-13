(ns euler.level1.problem008-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem008 :refer :all]))

; https://projecteuler.net/problem=8

(describe "Euler Problem #8"

  (it "gets the product of n adjacents numbers from any point in list"
    (should= 6 (product-of-vector '(1 2 3)))
    (should= 24 (product-of-vector '(1 2 3 4)))
    (should= 1 (product-of-vector '(1)))
    (should= 1 (product-of-vector '()))
    (should= -5 (product-of-vector '(-1 5)))
    )

  (it "checks if supposed subvec would be out of bounds"
    (should-not (out-of-bounds? [1 2 3] 0 2))
    (should-not (out-of-bounds? [1 2 3] 0 0))
    (should (out-of-bounds? [1 2 3] 0 6))
    (should-not (out-of-bounds? [1 2 3] 0 1))
    (should (out-of-bounds? [1 2 3 4 5 6 7] 8 9))
    )

  (it "gets all possible subvec products in a lazy sequence"
    (should= [2] (get-lazyseq-products [1 2] 0 2))
    (should= [] (get-lazyseq-products [1 2] 0 4))
    (should= [] (get-lazyseq-products [] 0 2))
    (should= [-2] (get-lazyseq-products [1 -2] 0 2))
    (should= [30 20 12 6 2] (get-lazyseq-products [1 2 3 4 5 6] 0 2))
    )

  (it "Solves #8"
    (should= 1 (euler-8 [1] 1))
    (should= 2 (euler-8 [1 2] 1))
    (should= 2 (euler-8 [1 2] 2))
    (should= nil (euler-8 [] 10))
    (should= 6 (euler-8 [1 2 3] 3))
    (should= 720 (euler-8 [1 2 3 4 5 6 7 8 9 10] 3))
    (should= 3628800 (euler-8 [1 2 3 4 5 6 7 8 9 10] 10))
    (should= -6 (euler-8 [-1 2 3] 3))
    )
  )

(run-specs)
