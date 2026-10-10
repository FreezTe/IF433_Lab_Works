package oop_00000090472_RafaelGadingSamoda.week07RafaelGS_90472

fun main (){


    println("=== TEST SINNGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect

    println("\n=== TEST COMPANION OBJECT ===")
    val client =
        NetworkClient.createClient()
    client.connect()
}