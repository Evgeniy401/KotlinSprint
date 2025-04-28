package lesson_2

fun main() {

    val checkOutHour = 9
    val checkOutMinute = 39
    val travelTimeInMinutes = 457

    val generalValueMinutes = checkOutMinute + travelTimeInMinutes
    val arrivalHour = generalValueMinutes / ONE_HOUR + checkOutHour
    val arrivalMinute = generalValueMinutes % ONE_HOUR

    println("Время прибытия: %02d:%02d".format(arrivalHour % 24, arrivalMinute))

}

const val ONE_HOUR = 60
