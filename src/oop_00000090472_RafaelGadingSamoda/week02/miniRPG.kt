package oop_00000090472_RafaelGadingSamoda.week02
import java.util.Scanner


class Hero(var name: String, var hp : Int = 100, var baseDamage : Int){

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


fun miniRPG() {
    
}