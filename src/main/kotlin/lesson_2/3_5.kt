package lesson_2

fun main() {

    var move = "D2-D4;0"
    var (from, where, numberMove) = move.split("-", ";")

    println(from)
    println(where)
    println(numberMove)

}