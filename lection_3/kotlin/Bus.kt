class Bus (color: Color, name: String, numberOfWheels: Int, maxPeople: Int, var typeOfBus: String) :
    Transport(color, name, numberOfWheels, maxPeople) {
    override fun printInfoTransport() {
        println("Color: " + color + " Name transport: " + name + " Number Of Wheels: "
                + numberOfWheels + " Max people: " + maxPeople + " Type of Bus: "+ typeOfBus)
    }
}