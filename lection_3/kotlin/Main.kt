
fun main(){
    println("* Task 1\n - Kotlin:")
    val teacherOne: Teacher = Teacher("Tom", "Cat", 25, 9, 2.0)
    val teacherTwo: Teacher = Teacher("Jerry", "Mouse", 22, 10, 1.0)
    //val teacherTwo: Teacher = Teacher("Tom", "Cat", 25, 9, 2.0)
    if (teacherOne == teacherTwo) println("Objects are equal")
    else println("Objects are not equal")

    println("\n - Java:")
    val teachJavaOne: TeacherJava = TeacherJava("Tom", "Cat", 25, 9, 3.0)
}