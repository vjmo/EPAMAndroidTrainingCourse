typealias Ui = UserUiModel

fun User.printInfo(numberOfChar: Int) {

    var space: String = " "
    var stringUser: String = "Name:$name${space.repeat(numberOfChar)}" +
            "Surname:$surname${space.repeat(numberOfChar)}" +
            "Age:$age${space.repeat(numberOfChar)}" +
            "Email:${space.repeat(numberOfChar)}" +
            "Phone:$numberPhone"
    println(stringUser)
    fun printing() {}

}

fun User.toUserUiModel() = Ui(
    name = "$name",
    surname = "$surname"
)

inline fun User.printInfoInline(numberOfSpaces: Int, printing: (String)->Unit){
//copy
}