package oop_00000090472_RafaelGadingSamoda.week07RafaelGS_90472

object DatabaseManager {
var connectionStatus:String = "Disconnected"

    fun connect(){
        connectionStatus = "Connected to Server"
        println("Database is ready.")
    }
}