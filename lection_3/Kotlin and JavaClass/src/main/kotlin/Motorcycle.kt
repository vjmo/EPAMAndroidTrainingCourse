class Motorcycle(color: Color, name: String, numberOfWheels: Int, maxPeople: Int, var weight: Double) :
    Transport(color, name, numberOfWheels, maxPeople) {
    override fun printInfoTransport() {
        println("Color: " + color + " Name transport: " + name + " Number Of Wheels: "
                + numberOfWheels + " Max people: " + maxPeople + " Weight: "+ weight)
    }
}