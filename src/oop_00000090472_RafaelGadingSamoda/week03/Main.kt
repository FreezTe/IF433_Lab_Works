package oop_00000090472_RafaelGadingSamoda.week03

fun main(){
    val e = Employee("Budi")
    println("test error")
    e.salary = -1000
    e.salary = 50000000
    println("Gaji: ${e.salary}")


    e.increasePerformance()

    println("Pajak yang harus dibayar: ${e.tax}")
}