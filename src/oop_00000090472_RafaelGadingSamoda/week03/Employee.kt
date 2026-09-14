package oop_00000090472_RafaelGadingSamoda.week03

class Employee(val name : String){
    var salary : Int = 0
        set(value) {
            if (value > 0){
                println("ERROR: gaji tidak boleh negatif! Di-set ke 0")
                field = 0
            }else{
                field = value
            }
        }
    println("Mencoba set gaji ke: $value")
    this.salary = value

    private var performanceRating: Int = 3
    fun increasePerformaance(){
        performanceRating++
        println("Kinerja $name meningkat! Rating: $performanceRating")
    }


    fun printStatus(){
        println("Karyawan: $name, Rating: $performanceRating")
    }
}