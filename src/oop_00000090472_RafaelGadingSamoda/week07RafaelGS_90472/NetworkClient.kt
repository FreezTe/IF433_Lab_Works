package oop_00000090472_RafaelGadingSamoda.week07RafaelGS_90472

class NetworkClient private constructor(val url : String) {
    fun connect(){
        println("Connecting to $url...")
    }
}