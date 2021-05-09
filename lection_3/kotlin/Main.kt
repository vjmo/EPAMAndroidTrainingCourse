
fun main(){
    println("* Task 1\n - Kotlin:")
    val teacherOne: Teacher = Teacher("Tom", "Cat", 25, 9, 2.0)
    val teacherTwo: Teacher = Teacher("Jerry", "Mouse", 22, 10, 1.0)
    //val teacherTwo: Teacher = Teacher("Tom", "Cat", 25, 9, 2.0)
    if (teacherOne == teacherTwo) println("Objects are equal")
    else println("Objects are not equal")

    println("\n - Java:")
    val teacherJavaOne: TeacherJava = TeacherJava("Tom", "Cat", 25, 9, 2.0)
    val teacherJavaTwo: TeacherJava = TeacherJava("Jerry", "Mouse", 22, 10, 1.0)
    //val teacherJavaTwo: TeacherJava = TeacherJava("Tom", "Cat", 25, 9, 2.0)
    if (teacherJavaOne == teacherJavaTwo) println("Objects are equal")
    else println("Objects are not equal")

    println("\n* Task 2")
    val car: Car = Car(Color.black, "BMW", 4, 4,false)
    car.infoTransmission()
    car.printInfoTransport()

    val motorcycle: Motorcycle = Motorcycle(Color.blue, "Honda", 2, 2,200.0)
    motorcycle.printInfoTransport()

    val bus: Bus = Bus (Color.red, "PAZ-672",4,40,"Экскурсионный")
    bus.printInfoTransport()

    println("\n* Task 3")
    println("Status - ${Status.not_married}")

    println("\n* Task 4")
    val student: Human.Student = Human.Student(19,"Polly",289,"Прикладная информатика",Status.not_married)
    val lecturer: Human.Lecturer = Human.Lecturer("Boris",22.9,66)
    val rector: Human.Rector = Human.Rector("Stepan",30.0,"OxfordOL",Status.married)
}