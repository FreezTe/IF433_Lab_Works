package oop_00000090472_RafaelGadingSamoda.week06RafaelGS_90472


fun processCheckout(method: PaymentMethod, amount: Double){
    println("-> Memulai checkout....")
    method.pay(amount)
}


fun main() {
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKOUT ===")
    processCheckout(pay1, 50000.0)
    processCheckout(pay2, 150000.0)


    val lamp = SmartLampTM(id = "D01", name = "Ruang Tamu")
    val speaker = SmartSpeakerTM(id = "D02", name = "Google Nest Dapur")
    val cctv = SmartCCTVTM(id = "D03", name = "Ezviz Garasi")

    val hub = SmartHomeHub()
    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

// --- Testing ---
    println("\n=== TEST SMART HOME SYSTEM ===")
    hub.activateSecurityMode()   // cctv & lamp? -> hanya yg Recordable (cctv) + speaker putar sirine
    hub.turnOffAllSwitches()     // semua yg Switchable (lamp, speaker, cctv) dimatikan
}