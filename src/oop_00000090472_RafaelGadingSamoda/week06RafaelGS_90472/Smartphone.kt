package oop_00000090472_RafaelGadingSamoda.week06RafaelGS_90472

class Smartphone : Camera, Phone{
    override fun turnOn() {
        super<Camera>.turnOn()
        super<Phone>.turnOn()
        println("Sistem operasi Smartphone berhasil booting.")
    }
}
