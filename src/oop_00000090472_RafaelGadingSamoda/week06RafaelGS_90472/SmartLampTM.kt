package oop_00000090472_RafaelGadingSamoda.week06RafaelGS_90472

class SmartLampTM(override val id: String, override val name: String): SmartDevice, Switchable {
    override fun turnon() {
        println("${name} akan menyalakan lampu")
    }
    override fun turnof() {
        println("${name} akan mematikan lampu")
    }

}