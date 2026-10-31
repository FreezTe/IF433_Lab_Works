package oop_00000090472_RafaelGadingSamoda.week08RafaelGS_90472

fun main (){
    println("== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)

    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota tidak Diketahui"

    println("Tujuan pengiriman: $destination")
}