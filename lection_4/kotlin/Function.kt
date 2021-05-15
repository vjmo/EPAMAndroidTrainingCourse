typealias Ui = UserUiModel

fun User.printInfo(numberOfChar: Int, fooPrint: (String) -> Unit) {

    var space: String = " "
    var stringUser: String = "Name:$name${space.repeat(numberOfChar)}" +
            "Surname:$surname${space.repeat(numberOfChar)}" +
            "Age:$age${space.repeat(numberOfChar)}" +
            "Email:${space.repeat(numberOfChar)}" +
            "Phone:$numberPhone"
    fooPrint(stringUser)

}

fun User.toUserUiModel() = Ui(
    name = "$name",
    surname = "$surname"
)

inline fun User.printInfoInline(numberOfChar: Int, fooPrint: (String) -> Unit){

    var space: String = " "
    var stringUser: String = "Name:$name${space.repeat(numberOfChar)}" +
            "Surname:$surname${space.repeat(numberOfChar)}" +
            "Age:$age${space.repeat(numberOfChar)}" +
            "Email:${space.repeat(numberOfChar)}" +
            "Phone:$numberPhone"
    fooPrint(stringUser)
}

