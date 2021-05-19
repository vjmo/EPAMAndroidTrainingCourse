import java.util.*

fun main() {

    var carOne: Car = Car(12345, "black", "BMW", true)
    var carTwo: Car = Car(67890, "white", "Honda", true)
    var bikeOne: Bike = Bike(101, "black", "Yamaha", false)
    var bikeTwo: Bike = Bike(103, "white", "Honda", false)

    var carGarageOne: Garage<Car> = Garage<Car>()
    var bikeGarageOne: Garage<Bike> = Garage<Bike>()

    carGarageOne.addTransport(carOne)
    carGarageOne.addTransport(carTwo)
    bikeGarageOne.addTransport(bikeOne)
    bikeGarageOne.addTransport(bikeTwo)

    var carList = carGarageOne.getTransport().filter { it.brand.length > 4 }.map { it.toUiModel() }
}