package oop_00000090472_RafaelGadingSamoda.week03

class Weapon (var name : String){
    var damage : Int = 0
        set(value) {
            if (value < 0) {
                field = 0
                println("Tidak boleh menggunakan angka negatif")
            } else if (value > 1000) {
                field = 1000
                println("Tidak boleh menggunakan angka di atas 1000")

            } else {
                field = value
            }
        }

            val tier : String
            get() = when{
                damage > 800 -> "Legendary"
                damage > 500 -> "Epic"
                else -> "Common"
            }

}