typealias Ui = UserUiModel

fun User.printInfo(numberOfChar: Int, fooPrint: (String) -> Unit) {

    var space: String = " "
    space.repeat(numberOfChar)

    var stringUser: String = "Name:$name${space}" +
            "Surname:$surname${space}" +
            "Age:$age${space}" +
            "Email:${space}" +
            "Phone:$numberPhone"
    fooPrint(stringUser)

}

fun User.toUserUiModel() = Ui(
    name = name,
    surname = surname
)

inline fun User.printInfoInline(numberOfChar: Int, fooPrint: (String) -> Unit){

    var space: String = " "
    space.repeat(numberOfChar)

    var stringUser: String = "Name:$name${space}" +
            "Surname:$surname${space}" +
            "Age:$age${space}" +
            "Email:${space}" +
            "Phone:$numberPhone"
    fooPrint(stringUser)
}

