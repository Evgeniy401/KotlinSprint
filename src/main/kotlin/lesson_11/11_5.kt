package org.example.lesson_11

fun main() {

    val fishing = Forum()

    fishing.createNewUser("Вася")
    fishing.createNewUser("Боб")
    fishing.createNewMessage(1, "Вася категорически всех приветствует")
    fishing.createNewMessage(2, "Боб ищет рыбное место")
    fishing.printThread()
}

class Forum {
    private var lastId = 0

    private var membersOfForum: MutableList<ForumMember> = mutableListOf()
    private val messages: MutableList<MessageForum> = mutableListOf()

    fun createNewUser(userName: String): ForumMember {
        val newMember = ForumMember(++lastId, userName)
        membersOfForum.add(newMember)
        return newMember
    }

    fun createNewMessage(authorId: Int, messageText: String) {
        for (member in membersOfForum) {
            if (member.userId == authorId) {
                messages.add(MessageForum(authorId, messageText))
                return
            }
        }
    }

    fun printThread() {
        for (message in messages) {
            val authorName = membersOfForum.find { it.userId == message.authorId }?.userName ?: ""
            println("$authorName: ${message.message}")
        }
    }
}

class ForumMember(val userId: Int, val userName: String)
class MessageForum(val authorId: Int, val message: String)