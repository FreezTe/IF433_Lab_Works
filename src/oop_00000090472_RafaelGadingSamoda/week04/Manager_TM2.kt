package oop_00000090472_RafaelGadingSamoda.week04


class Manager_TM2(name : String, baseSalary : Int): Employee_TM2(name,baseSalary) {
    override fun calculateBonus(): Int {
        return super.calculateBonus() + 500000
    }

    override fun work() {
        "$name sedang memimpin rapat divisi."
    }
}