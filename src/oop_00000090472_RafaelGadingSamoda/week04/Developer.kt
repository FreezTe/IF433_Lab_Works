package oop_00000090472_RafaelGadingSamoda.week04


class Developer(name : String, baseSalary: Int, val programingLanguage: String): Employee_TM2(name, baseSalary) {
    override fun work() {
        println("$name sedang ngoding menggunakan $programingLanguage")
    }
}