fun main() {
    var userOne = User(id = 1,
        name="NameOne",
        surname = "SurnameOne",
        age = 18,
        email = "name_surname_one@email.com",
        numberPhone = 1001001)
    userOne.printInfo(3) { print(it) }
    println()
    userOne.printInfoInline(8) { print(it) }
}