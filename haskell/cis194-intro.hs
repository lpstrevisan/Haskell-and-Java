-- CIS 194 course of the University of Pennsylvania - Introdution to Haskell - Week 1 

toDigitsRev :: Integer -> [Integer]
toDigitsRev n | n <= 0 = []
              | otherwise =  mod n 10 : toDigitsRev (div n 10)

toDigits :: Integer -> [Integer]
toDigits n = reverse (toDigitsRev n)

doubleEveryOtherRev :: [Integer] -> [Integer]
doubleEveryOtherRev [] = []
doubleEveryOtherRev (x:[]) = [x]
doubleEveryOtherRev (x:(y:zs)) = x : 2 * y : doubleEveryOtherRev zs

doubleEveryOther :: [Integer] -> [Integer]
doubleEveryOther n = reverse (doubleEveryOtherRev (reverse n))

sumDigits :: [Integer] -> Integer
sumDigits [] = 0
sumDigits (x:xs) | x < 10 = x + sumDigits xs
                 | otherwise = sumDigits (toDigits x) + sumDigits xs

validate :: Integer -> Bool
validate n | mod (sumDigits (doubleEveryOther (toDigits n))) 10 == 0 = True
           | otherwise = False

-- Hanoi(Claude)

type Peg = String
type Move = (Peg, Peg)

hanoi :: Integer -> Peg -> Peg -> Peg -> [Move]
hanoi n a b c | n == 1 = [(a, b)]
              | otherwise = hanoi (n-1) a c b ++ [(a, b)] ++ hanoi (n-1) c b a
