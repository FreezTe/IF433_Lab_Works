package oop_00000090472_RafaelGadingSamoda.week02




import java.util.Scanner

class Herocoba(
    var name: String,
    var baseDamage: Int,
    var hp: Int = 100
) {

    var isAlive: Boolean = true

    fun attack(target: Enemy) {
        println("$name menyerang ${target.name}")
        target.takeDamage(baseDamage)
    }

    fun takeDamage(damage: Int) {
        println("$name menerima damage $damage")

        hp -= damage

        if (hp < 0) {
            hp = 0
        }

        if (hp == 0) {
            isAlive = false
            println("$name telah kalah")
        }
    }
}

class Enemy(
    var name: String,
    var hp: Int,
    var baseDamage: Int
) {

    var isAlive: Boolean = true

    fun attack(target: Herocoba) {
        println("$name menyerang ${target.name}")
        target.takeDamage(baseDamage)
    }

    fun takeDamage(damage: Int) {
        println("$name menerima damage $damage")

        hp -= damage

        if (hp < 0) {
            hp = 0
        }

        if (hp == 0) {
            isAlive = false
            println("$name telah kalah")
        }
    }
}

fun main (){
    miniRPGcoba()
}
fun miniRPGcoba() {

    val scanner = Scanner(System.`in`)

    println("------- Simplest RPG ------")

    print("Masukkan nama hero: ")
    val heroName = scanner.nextLine()

    println()
    println("Choose difficulty:")
    println("1. Hard")
    println("2. Normal")

    print("Your choice: ")
    val enemyChoose = scanner.nextLine()

    val enemy: Enemy

    when (enemyChoose) {
        "1" -> {
            enemy = Enemy("Behemoth", 200, 7)
            println("Difficulty: HARD")
        }

        "2" -> {
            enemy = Enemy("Hellhound", 50, 3)
            println("Difficulty: NORMAL")
        }

        else -> {
            println("Pilihan tidak valid")
            return
        }
    }

    val hero = Herocoba(heroName, 10, 100)

    println()
    println("------------------------------")
    println("     WELCOME TO THE MINIGAME")
    println("------------------------------")
    println()
    println("$heroName VS ${enemy.name}")
    println()

    var turn = 1

    while (hero.isAlive && enemy.isAlive) {

        println("------------------------------")
        println("TURN $turn")
        println("------------------------------")

        println("$heroName HP : ${hero.hp}")
        println("${enemy.name} HP : ${enemy.hp}")
        println()

        println("1. Attack")
        println("2. Check Status")
        print("Choose action: ")

        val action = scanner.nextLine()

        when (action) {

            "1" -> {
                hero.attack(enemy)

                if (enemy.isAlive) {
                    println()
                    enemy.attack(hero)
                }
            }

            "2" -> {
                println()
                println("========== STATUS ==========")
                println("$heroName")
                println("HP     : ${hero.hp}")
                println("Damage : ${hero.baseDamage}")
                println()
                println("${enemy.name}")
                println("HP     : ${enemy.hp}")
                println("Damage : ${enemy.baseDamage}")
                println("============================")
            }

            else -> {
                println("Pilihan tidak valid")
            }
        }

        println()
        turn++
    }

    println()
    println("==============================")

    if (hero.isAlive) {
        println("VICTORY!")
        println("$heroName berhasil mengalahkan ${enemy.name}")
    } else {
        println("GAME OVER!")
        println("$heroName telah dikalahkan oleh ${enemy.name}")
    }

    println("==============================")
}

