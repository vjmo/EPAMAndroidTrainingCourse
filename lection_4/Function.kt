

fun User.printInfo(numberOfSpaces: Int, printing: (String)->Unit) {

    println("Name: $name Surname: $surname$ Age: $age$ Email: $email$ Phone: $numberPhone\n")
    printing("Name: $name Surname: $surname$ Age: $age$ Email: $email$ Phone: $numberPhone\n")
}

fun User.toUserUiModel() = Ui(
    name = "$name",
    surname = "$surname"
)

inline fun User.printInfoInline(numberOfSpaces: Int, printing: (String)->Unit){
    println("Name: $name Surname: $surname$ Age: $age$ Email: $email$ Phone: $numberPhone\n")
    printing("Name: $name Surname: $surname$ Age: $age$ Email: $email$ Phone: $numberPhone\n")
}

typealias Ui = UserUiModel