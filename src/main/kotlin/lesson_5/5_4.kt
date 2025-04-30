package lesson_5

fun main() {

    println("Введите ваше имя")
    val name = readln()

    if (name == "Zaphod")

    { println("Введите пароль")
        val password = readln()

        if (password == "PanGalactic")
            println("Приветствуем Вас!")

        else println("Неверный пароль")

    } else println("Пройти авторизацию")

}