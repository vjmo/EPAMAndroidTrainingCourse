fun main() {
    var userOne = User(1, "NameOne", "SurnameOne", 18, "name_surname_one@email.com", 1001001)
    userOne.printInfo(3) { print(it) }
    println()
    userOne.printInfoInline(8) { print(it) }
}