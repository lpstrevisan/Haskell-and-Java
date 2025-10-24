-- Exam for the semester 2024.2 of the Federal University of Pernambuco

-- questão 1
insert :: Int -> [Int] -> [Int]
insert n [] = [n]
insert n (x:xs) | n > x = x : insert n xs
                | otherwise = n : (x:xs)

-- questão 2
testaPrimo :: Int -> [Int] -> Bool
testaPrimo _ [] = True
testaPrimo n (x:xs) | mod n x == 0 = False
                    | otherwise = testaPrimo n xs 

ehPrimo :: Int -> Bool
ehPrimo n | n < 2 = False
          | otherwise = testaPrimo n [(n-1), (n-2)..2]

-- questão 3
sqr :: Int -> Int
sqr n = n * n

testaPrimoList :: [Int] -> [Int]
testaPrimoList (x:xs) = filter (ehPrimo) (x:xs)

sumPrimeSquares1 :: Int -> Int -> Int
sumPrimeSquares1 m n = sum(map (sqr) (testaPrimoList [m, (m+1)..n]))

-- questão 4
sumPrimeSquaresLambda :: Int -> Int -> Int
sumPrimeSquaresLambda m n = sum(map (\n -> n * n) (testaPrimoList [m, (m+1)..n]))

-- questão 5
testaPrimoList1 :: [Int] -> [Int]
testaPrimoList1 xs = [x | x <- xs, ehPrimo x]

dobraLista :: [Int] -> [Int]
dobraLista xs = [x * x | x <- xs]

sumPrimeSquares2 :: Int -> Int -> Int
sumPrimeSquares2 m n = sum (dobraLista(testaPrimoList1 [m, (m+1)..n]))

-- questão 6
data Tree = No Int Tree Tree | Folha Int deriving Show

teste1 = No 50 (No 25 (No 12 (Folha 6) (Folha 13))
                      (No 30 (Folha 26) (Folha 32)))
               (Folha 59)

teste2 = No 100 teste1
                 (No 200 (Folha 99)
                       (No 298 (Folha 299) (Folha 299)))


ordenada :: Tree -> Bool
ordenada (No n (Folha f1) (Folha f2)) | n >= f1 && n <= f2 = True
                                      | otherwise = False
ordenada (No n (Folha f1) (No n1 t1 t2)) | n < f1 || n > n1 = False
                                         | otherwise = ordenada (No n1 t1 t2)
ordenada (No n (No n1 t1 t2) (Folha f1)) | n < n1 || n > f1 = False
                                         | otherwise = ordenada (No n1 t1 t2)
ordenada (No n (No n1 t1 t2) (No n2 t3 t4)) | n < n1 || n > n2 = False
                                            | otherwise = ordenada (No n1 t1 t2) && ordenada (No n2 t3 t4)  
