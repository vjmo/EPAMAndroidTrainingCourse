class Car(color: Color, name: String, numberOfWheels: Int, maxPeople: Int, var transmission: Boolean) :
    Transport(color, name, numberOfWheels, maxPeople) {

    fun infoTransmission(){
        println("Mechanical = true; Automatic = false")
    }
    override fun printInfoTransport() {
        println("Color: " + color + " Name transport: " + name + " Number Of Wheels: "
                + numberOfWheels + " Max people: " + maxPeople + " Transmission: "+ transmission)
    }

}