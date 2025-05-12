package lesdson_6

fun main() {

    println("Создайте логин:")
    val correctLogin = readln()

    println("Создайте пароль:")
    val correctPassword = readln()

    println("\nРегистрация завершена. Теперь выполните вход.\n")

    var isAuthenticated = false

    while (!isAuthenticated) {
        println("Введите логин:")
        val inputLogin = readln()

        println("Введите пароль:")
        val inputPassword = readln()

        if (inputLogin == correctLogin && inputPassword == correctPassword) {
            isAuthenticated = true
            println("Авторизация прошла успешно!")
        } else {
            println("Неверный логин или пароль. Попробуйте снова.\n")
        }
    }
}




