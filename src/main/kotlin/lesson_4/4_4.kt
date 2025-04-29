package lesson_4

fun main() {

    val trainingDay = 5
    val armExercises: Boolean = (trainingDay % 2 != 0)
    val abExercises: Boolean = (trainingDay % 2 != 0)
    val legExercises: Boolean = (trainingDay % 2 == 0)
    val backExercises: Boolean = (trainingDay % 2 == 0)

    println("""
        Сегодня нужно выполнить:
        Упражнения для рук:    $armExercises
        Упражнения для пресса: $abExercises
        Упражнения для ног:    $legExercises
        Упражнения для спины:  $backExercises
    """.trimIndent())

}