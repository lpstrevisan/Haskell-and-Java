-- Exam for the semester 2022.2 of the Federal University of Pernambuco

-- questão 1
conta0DaLista :: [Int] -> Int
conta0DaLista [] = 0
conta0DaLista (x:xs) | x == 0 = 1 + conta0DaLista xs
                     | otherwise = 0

rlencode0 :: [Int] -> [Int]
rlencode0 [] = []
rlencode0 (x:xs) | x == 0 = 0 : n : rlencode0 (drop (n-1) xs)
                 | otherwise =  x : rlencode0 xs
    where
       n = conta0DaLista (x:xs) 

criaListaDe0 :: Int -> [Int]
criaListaDe0 0 = []
criaListaDe0 n = 0 : criaListaDe0 (n-1)

rldecode0 :: [Int] -> [Int]
rldecode0 [] = []
rldecode0 (0:x:xs) = criaListaDe0 x ++ rldecode0 xs   
rldecode0 (x:xs) = x : rldecode0 xs

-- questão 2
contaLetraDaLista :: String -> Int
contaLetraDaLista [] = 0
contaLetraDaLista (x:[]) = 0
contaLetraDaLista (x:xs) | x == head xs = 1 + contaLetraDaLista xs
                         | otherwise = 0

rlencodeLetras :: String -> String
rlencodeLetras [] = []
rlencodeLetras (x:xs) | length xs > 0 && x == head xs = (x : show(n+1)) ++ rlencodeLetras (drop (n) xs)
                      | otherwise = x : rlencodeLetras xs
    where 
        n = contaLetraDaLista (x:xs)

ehDigito :: Char -> Bool 
ehDigito c = case c of
    '0' -> True
    '1' -> True
    '2' -> True
    '3' -> True
    '4' -> True
    '5' -> True
    '6' -> True
    '7' -> True
    '8' -> True
    '9' -> True
    _ -> False

criaListaDeLetra :: Char -> Int -> String
criaListaDeLetra _ 0 = []
criaListaDeLetra c n = c : criaListaDeLetra c (n-1)

rldecodeLetras :: String -> String
rldecodeLetras [] = []
rldecodeLetras (x:y:zs) | ehDigito y == True = (criaListaDeLetra x (read [y]::Int)) ++ rldecodeLetras zs
rldecodeLetras (x:xs) = x : rldecodeLetras xs

--Questão 3
data Letra = Unica Char
           | Repetida Char Int
    deriving Show

separaUnicaRepetida :: String -> [Letra]
separaUnicaRepetida [] = []
separaUnicaRepetida (x:xs) | length xs > 0 && ehDigito (head xs) == True = Repetida x (read [head xs]::Int) : separaUnicaRepetida xs
                           | ehDigito x == True = separaUnicaRepetida xs
                           | otherwise = Unica x : separaUnicaRepetida xs

rlencodeLetrasCodigo :: String -> [Letra]
rlencodeLetrasCodigo [] = []
rlencodeLetrasCodigo (x:xs) = separaUnicaRepetida s
    where 
       s = rlencodeLetras (x:xs)


rldecodeLetrasCodigo :: [Letra] -> String
rldecodeLetrasCodigo [] = []
rldecodeLetrasCodigo ((Unica c):xs) = c : rldecodeLetrasCodigo xs
rldecodeLetrasCodigo ((Repetida c n):xs) = (criaListaDeLetra c n) ++ rldecodeLetrasCodigo xs
