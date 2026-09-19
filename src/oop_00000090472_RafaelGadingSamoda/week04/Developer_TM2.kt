package oop_00000090472_RafaelGadingSamoda.week04


class Developer_TM2(name : String, baseSalary: Int, val programingLanguage: String): Employee_TM2(name, baseSalary) {
    override fun work() {
        println("$name sedang ngoding menggunakan $programingLanguage")
    }
}