package ch3
import scala.annotation.tailrec

object ch3Exercises{
    case class Student(name: String, height: Int)
    // Exercise 3.1
    def names(l: List[Student]): List[String] = l match {
        case Nil => Nil
        case h :: t => h.name :: names(t)
    }

    // Exercise 3.2
    def tall(l: List[Student]): List[Student] = {
        l.filter(_.height >= 170)
    }

    // Exercise 3.3
    def length(l: List[Int]): Int = {
        var res = 0
        @tailrec def lenCal(l: List[Int], inter: Int): Int = l match {
            case Nil => inter
            case h :: t => lenCal(t, inter + 1)
        }
        lenCal(l, 0)
    }

    // Exercise 3.4
    def append(l: List[Int], n: Int): List[Int] = l match {
        case Nil => List(n)
        case h :: t => h :: append(t, n)
    }
}