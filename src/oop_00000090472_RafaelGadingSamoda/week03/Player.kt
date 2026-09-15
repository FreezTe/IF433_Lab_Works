package oop_00000090472_RafaelGadingSamoda.week03

fun main(){
    val e = Weapon("Bucky")
    println("test error")
    e.damage = -20
    println("${e.name} memeberikan damage ${e.damage} dengan tier ${e.tier}")
    e.damage = 130
    println("${e.name} memeberikan damage ${e.damage} dengan tier ${e.tier}")

}