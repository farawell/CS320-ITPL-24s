package ch4

// Exercise 4.1
def incBy(l: List[Int], n: Int): List[Int] = {
    l.map(_ + n)
}

// Exercise 4.2
def gt(l: List[Int], n: Int): List[Int] = {\
    l.filter(_ >= n)
}

// Exercise 4.3
def append(l: List[Int], n: Int): List[Int] = {
    l.foldRight(n)(_ :: _)
}

// Exercise 4.4
def reverse(l: List[Int]): List[Int] = {
    l.foldLeft()
}