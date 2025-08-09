package org.example.lesson_14

fun main() {

    val ship1 = Liner("Весна")
    val ship2 = Cargo("Десна")
    val ship3 = Icebreaker("Бравый")
}

open class Liner(
    val name: String,
    val speed: Int = 60,
    val capacity: Int = 400, // вместительность пассажиров
    val carrying: Int = 250, // грузоподьемность
    val icebreakerAbility: Boolean = false,
)

class Cargo(
    name: String,
    speed: Int = 45,
    capacity: Int = 50,   // вместительность пассажиров
    carrying: Int = 500,   // грузоподьемность
): Liner(name, speed, capacity, carrying)

class Icebreaker(
    name: String,
    speed: Int = 40,
    capacity: Int = 70,   // вместительность пассажиров
    carrying: Int = 270,   // грузоподьемность
): Liner(name, speed, capacity, carrying, icebreakerAbility = true)