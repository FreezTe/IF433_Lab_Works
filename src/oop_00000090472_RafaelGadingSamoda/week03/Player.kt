package oop_00000090472_RafaelGadingSamoda.week03

class Player(var username: String) {

    private var xp: Int = 0

    val level: Int
        get() = (xp / 100) + 1

    fun addExp(amount: Int) {
        if (amount < 0) {
            println("Tidak bisa minus")
            return
        }

        val levelSebelum = level
        xp += amount
        val levelSesudah = level

        if (levelSesudah > levelSebelum) {
            println("Level Up! Selamat $username sudah mencapai level $levelSesudah !")
        }
    }
}