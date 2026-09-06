package oop_00000090472_RafaelGadingSamoda.week02
import java.util.Scanner


class Herocoba(var name: String, var hp : Int = 100, var baseDamage : Int){

    var isAlive : Boolean? = null
    fun attack(targetName: String){
        println("$name menyerang $targetName")
    }

    fun takeDamage(damage : Int){
        println("$name take $damage")
        hp -= damage
        if (hp < 0){
            hp = 0
        }
        if (hp == 0){
            isAlive = false
        }else {
            isAlive = true
        }
    }
}
class Enemy(var name: String, var hp : Int , var baseDamage : Int){

    var isAlive : Boolean? = null
    fun attack(targetName: String){
        println("$name menyerang $targetName")
    }

    fun takeDamage(damage : Int){
        println("$name take $damage")
        hp -= damage
        if (hp < 0){
            hp = 0
        }
        if (hp == 0){
            isAlive = false
        }else {
            isAlive = true
        }
    }
}


fun miniRPGcoba() {
    var turn : Int = 0
    val Behemoth = Enemy("Behemoth", 200, 7)
    val Hellhound = Enemy("Hellhound", 50, 3)
    var Enemy : Enemy? = null

    val x = Scanner(System.`in`)

    println("------- Simplest RPG ------")
    print("Choose difficulty (Hard) or (Normal). (Answer with 1 for hard 2 for normal) :")
    val enemyChoose = x.nextLine()

    when(enemyChoose){
        "1" -> Enemy = Behemoth
        "2" -> Enemy = Hellhound
    }
    print("WELCOME TO THE MINIGAME")
    x.nextLine()

    for (turn = 0 ; 0 .. 5; turn++){

    }

}