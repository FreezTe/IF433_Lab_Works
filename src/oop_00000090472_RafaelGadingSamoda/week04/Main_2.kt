package oop_00000090472_RafaelGadingSamoda.week04



fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = ElectricCar("Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()
}