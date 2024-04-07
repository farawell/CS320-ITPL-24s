package common

case class Student(name: String, var height: Int)

trait TraitStudent {
  // A method within the trait that operates on a Student instance, for example:
    def printStudentDetails(student: Student): Unit = {
        println(s"Student Name: ${student.name}, Height: ${student.height}cm")
    }

    // A method to update the height of a Student.
    // Note: This is somewhat unconventional as case classes are typically used for immutable data.
    def updateHeight(student: Student, newHeight: Int): Unit = {
        student.height = newHeight
    }

    // def tall(l: List[Student]): List[String] = {
    //     l.filter( _ .height > 170).map( _ .name)
    // }
    def tall(l: List[Student]): List[String] = {
        for (s <- l if s.height > 170) 
            yield s.name
    }
}
