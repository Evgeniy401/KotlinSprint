package org.example.lesson_11

fun main() {

    val fishing = Room("Красивая картинка", "Рыбалка", mutableListOf())

    val randomMen = ParticipantRoom("Алеша")
    fishing.addParticipant(randomMen)

    val participants = fishing.getParticipants()
    println("Имя: ${participants[0].usersName}, Статус: ${participants[0].status}")

}

class Room(
    val cover: String,
    val roomName: String,
    private val listParticipants: MutableList<ParticipantRoom> = mutableListOf(),
) {
    fun addParticipant(newParticipant: ParticipantRoom) {
        listParticipants.add(newParticipant)
    }

    fun updateStatus(participant: MutableList<ParticipantRoom> = listParticipants) {
        val currentStatus = participant[0].status
        val newStatus = when (currentStatus) {
            UserStatus.TALKING -> UserStatus.MICROPHONE_OFF
            UserStatus.MICROPHONE_OFF -> UserStatus.MUTED
            UserStatus.MUTED -> UserStatus.TALKING
        }
        participant[0].status = newStatus
    }

    fun getParticipants(): List<ParticipantRoom> {
        return listParticipants.toList()
    }
}

class ParticipantRoom(
    val usersName: String,
    var status: UserStatus = UserStatus.MICROPHONE_OFF,
)

enum class UserStatus {
    TALKING, MICROPHONE_OFF, MUTED
}