package oop_00000090472_RafaelGadingSamoda.week06RafaelGS_90472

class Button(override val name: String) : Clickable{
    override fun click() {
        println("Tombol '$name berhasil diklik")
    }
}