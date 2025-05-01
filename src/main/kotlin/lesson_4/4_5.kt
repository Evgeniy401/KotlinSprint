package lesson_4

fun main() {

    println("Наличие повреждений корпуса")
    val caseDamage = readln().toBoolean()

    println("Состав экипажа")
    val crewComposition: Int = readln().toInt()

    println("Благоприятные метеоусловия")
    val favorableWeather = readln().toBoolean()

    println("Количество ящиков с провизией на борту")
    val numberBoxesWithProvisions: Int = readln().toInt()

    println(
        if (!caseDamage && crewComposition <= recommendedCrewComposition && crewComposition >= minimalCrewComposition
            && numberBoxesWithProvisions > minimalNumberBoxesWithProvisions) {
            "Корабль может приступить к долгосрочному плаванию"

        } else if (caseDamage && crewComposition == recommendedCrewComposition && numberBoxesWithProvisions > minimalNumberBoxesWithProvisions
            && favorableWeather) {
            "Корабль может отплыть"

        } else "Корабль не может отплыть и приступить к долгосрочному плаванию")

}

const val recommendedCrewComposition = 70
const val minimalCrewComposition =  55
const val minimalNumberBoxesWithProvisions = 50