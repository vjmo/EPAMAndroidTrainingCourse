import java.awt.Color
import java.util.*

open class Transport(var uniqueNumber: Int, var color: String, var brand: String)

class Car(
    uniqueNumber: Int,
    color: String,
    brand: String,
    transmission: Boolean
) : Transport(uniqueNumber, color, brand)

class Bike(
    uniqueNumber: Int,
    color: String,
    brand: String,
    tuning: Boolean
) : Transport(uniqueNumber, color, brand)

data class UIModel(var uniqueNumber: Int, var color: String, var brand: String)