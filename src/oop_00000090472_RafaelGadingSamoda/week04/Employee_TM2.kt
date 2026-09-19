package oop_00000090472_RafaelGadingSamoda.week04

open class Employee_TM2(val name : String, val baseSalary: Int) {


    open fun work(){
        println("$name sedang bekerja.")
    }

    open fun calculateBonus() : Int{
        return 10 * this.baseSalary / 100
    }
}