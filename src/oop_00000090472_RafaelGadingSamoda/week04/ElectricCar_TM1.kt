package oop_00000090472_RafaelGadingSamoda.week04

class ElectricCar_TM1(brand : String, numberOfDoor : Int, var batteryCapacity: Int): Car(brand,numberOfDoor) {
    final override fun accelerate() {
        println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity%.")
    }




}