package oop_00000090472_RafaelGadingSamoda.week08RafaelGS_90472

fun main (){
    println("== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)

    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota tidak Diketahui"

    println("Tujuan pengiriman: $destination")

    println("== TEST LET BLOCK ===")
    val validOrder = Order(null, 250000)

    val receipt = validOrder.totalPrice?.let{ price ->val tax = price * 0.11
    "Transaksi Valid. Harga: Rp$price, Pajak: Rp$tax"} ?: "Transaksi Invalid: Harga belum di-set!"

    println(receipt)
}