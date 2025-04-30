package lesson_4

fun main() {

    var tablesBookedToday = 13
    var tablesBookedTomorrow = 9
    var availabilityTablesToday: Boolean = tablesBookedToday < TOTAL_TABLES
    var availabilityTablesTomorrow: Boolean = tablesBookedTomorrow < TOTAL_TABLES

    println("Доступность столиков на сегодня - $availabilityTablesToday\n" +
            "Доступность столиков на завтра - $availabilityTablesTomorrow")

}

const val TOTAL_TABLES = 13