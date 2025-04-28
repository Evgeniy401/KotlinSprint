package lesson_4

fun main() {

    val minWeightAverage = 35
    val maxWeightAverage = 100
    val maxSizeAverage = 100

    var weight = 20
    var size = 80

    println("Соответствие груза весом $weight кг и объемом $size л категории \"Average\":" +
            " ${weight > minWeightAverage && weight <= maxWeightAverage && size < maxSizeAverage}")

    weight = 50
    size = 100

    println("Соответствие груза весом $weight кг и объемом $size л категории \"Average\": " +
            "${weight > minWeightAverage && weight <= maxWeightAverage && size < maxSizeAverage}")

}