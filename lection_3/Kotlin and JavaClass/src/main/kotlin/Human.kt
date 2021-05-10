sealed class Human {
    data class Student (var age: Int, var name: String,
                        var sumScoresExam: Int, var diractionOfTraining: String,
                        var status: Status)
    data class Lecturer(var name: String, var experience: Double,
                        var age: Int)
    data class Rector(var name: String, var experience: Double,
                      var nameUniversity: String,var status: Status)
}