package ch3

trait Template {
    sealed trait School
    case class Student(name: String, height: Int) extends School

    def names(l: List[Student]): List[String]

    def tall(l: List[Student]): List[Student]

    def length(l: List[Int]): Int

    def append(l: List[Int], n: Int): List[Int]
}
