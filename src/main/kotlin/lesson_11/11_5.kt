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
            }
        }
    }

    fun printThread() {
        for (message in messages) {
            var authorName = ""
            for (member in membersOfForum) {
                if (member.userId == message.authorId) {
                    authorName = member.userName
                    break
                }
            }
            println("$authorName: ${message.message}")
        }
    }
}

class ForumMember(val userId: Int, val userName: String)
class MessageForum(val authorId: Int, val message: String)