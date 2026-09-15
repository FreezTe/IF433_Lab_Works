package oop_00000090472_RafaelGadingSamoda.week03

fun main(){
    val e = Employee("Budi")
    println("test error")
    e.salary = -1000
    e.salary = 50000000
    println("Gaji: ${e.salary}")


    e.increasePerformance()

    println("Pajak yang harus dibayar: ${e.tax}")
    val d = Weapon("Bucky")
    println("test error")
    d.damage = -20
    println("${d.name} memeberikan damage ${d.damage} dengan tier ${d.tier}")
   d.damage = 130
    println("${d.name} memeberikan damage ${d.damage} dengan tier ${d.tier}")

    val player = Player("Rafael")

//     player.xp = 50
    player.addExp(50)
    println("Level saat ini: ${player.level}")

    player.addExp(60)
    println("Level saat ini: ${player.level}")

    player.addExp(-20)

}