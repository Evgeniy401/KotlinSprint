package lesson_2

fun main() {

    val numberPermanentEmployees = 50
    val numberTrainees = 20
    val salaryPermanentEmployees = 30000
    val salaryTrainees = 20000

    val expensesPermanentEmployees = numberPermanentEmployees * salaryPermanentEmployees
    val generalExpenses = expensesPermanentEmployees + (numberTrainees * salaryTrainees)
    val averageSalary = generalExpenses / (numberPermanentEmployees + numberTrainees)

    println(expensesPermanentEmployees)
    println(generalExpenses)
    println(averageSalary)

}