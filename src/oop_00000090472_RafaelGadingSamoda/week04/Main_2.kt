package oop_00000090472_RafaelGadingSamoda.week04



fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()


    println("\n--- Testing ElectricCar ---")
    val eCar = ElectricCar_TM1("Toyota", 4, 23)
    eCar.openTrunk()
    eCar.honk()
    eCar.accelerate()

    println("\n--- Testing Manager ---")
    val mngr = Manager_TM2("Toyota", 4)
    mngr.work()
    mngr.calculateBonus()


    println("\n--- Testing Employee ---")
    val dvlop = Developer_TM2("Toyota", 4, "C#")
    dvlop.work()
    dvlop.calculateBonus()
}