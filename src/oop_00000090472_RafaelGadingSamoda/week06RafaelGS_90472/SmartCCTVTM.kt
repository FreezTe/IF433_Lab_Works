package oop_00000090472_RafaelGadingSamoda.week06RafaelGS_90472

class SmartCCTVTM(override val id: String, override val name: String ): SmartDevice, Switchable, Recordable {

    override fun turnon() {
        println("[$name] CCTV menyala dan siap memantau.")
        // Otomatis mulai merekam saat dinyalakan
        startRecord()
    }

    override fun turnof() {
        println("[$name] CCTV dimatikan.")
    }

    override fun startRecord() {
        println("[$name] Mulai merekam ke penyimpanan lokal...")
    }
}