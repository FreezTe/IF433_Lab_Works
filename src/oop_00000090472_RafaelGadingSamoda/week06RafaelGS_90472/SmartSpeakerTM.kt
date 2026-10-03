package oop_00000090472_RafaelGadingSamoda.week06RafaelGS_90472

 class SmartSpeakerTM(override val id: String, override val name: String): SmartDevice, Switchable {
    override fun turnon() {
        println("[$name] Speaker aktif dan terhubung ke jaringan.")
    }

    override fun turnof() {
        println("[$name] Speaker dimatikan.")
    }
    fun playMusic(song: String) {
        println("$name memutar lagu $song")
    }

}