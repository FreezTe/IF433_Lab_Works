package oop_00000090472_RafaelGadingSamoda.week06RafaelGS_90472

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
    }

    // Smart Casting: hanya device yang "is Switchable" yang dimatikan
    fun turnOffAllSwitches() {
        println("\n=== MEMATIKAN SEMUA PERANGKAT YANG BISA DI-SWITCH ===")
        for (device in devices) {
            if (device is Switchable) {
                device.turnof()
            }
        }
    }


    // Smart Casting lanjutan: Recordable -> startRecord(), SmartSpeaker -> playMusic()
    fun activateSecurityMode() {
        println("\n=== MENGAKTIFKAN MODE KEAMANAN ===")
        for (device in devices) {
            if (device is Recordable) {
                device.startRecord()
            }
            if (device is SmartSpeaker) {
                device.playMusic("Sirine Peringatan")
            }
        }
    }
}