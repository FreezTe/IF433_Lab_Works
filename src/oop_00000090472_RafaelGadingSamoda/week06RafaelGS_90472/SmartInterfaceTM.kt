package oop_00000090472_RafaelGadingSamoda.week06RafaelGS_90472

class SmartInterfaceTM {

}

interface SmartDevice {
    val id : String
    val name : String
}

interface Swithcable{
    fun turnon()
    fun turnof()
}

interface Recordable{
    fun startRecord()
    fun stopRecord(){
        println("Perekaman dihentikan dan disimpan ke CLoud")
    }
}