package lesson_2

fun main() {

    val checkOutHour = 9
    val checkOutMinute = 39
    val travelTimeInMinutes = 457

    val valueTravelHours = travelTimeInMinutes / ONE_HOUR
    val remainingMinutes = travelTimeInMinutes % ONE_HOUR
    val arrivalMinute = (checkOutMinute + remainingMinutes) % ONE_HOUR
    val arrivalHour = checkOutHour + valueTravelHours + (checkOutMinute + remainingMinutes) / ONE_HOUR

    println("Время пррибытия - $arrivalHour:$arrivalMinute")

}

const val ONE_HOUR = 60
