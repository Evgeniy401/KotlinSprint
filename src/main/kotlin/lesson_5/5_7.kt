package lesson_5

fun main() {

    println("Введите расстояние поездки (в километрах)")
    val travelDistance: Double = readln().toDouble()

    println("Введите расход топлива на 100 километров (в литрах)")
    val fuelConsumption: Double = readln().toDouble()

    println("Введите текущую цену за литр топлива (в шекелях)")
    val currentFuelPrice: Double = readln().toDouble()

    val valueFuel = (travelDistance * fuelConsumption) / ONE_HUNDRED_KILOMETERS
    val generalFuelPrice = valueFuel * currentFuelPrice
    val generalFuelPriceFormatted = "%.2f".format(generalFuelPrice)

    println("Для вашей поездки необходимо $valueFuel литров топлива, \nDаш травел обойдется вам в $generalFuelPriceFormatted шекелей, черт побери!")

}

const val ONE_HUNDRED_KILOMETERS = 100