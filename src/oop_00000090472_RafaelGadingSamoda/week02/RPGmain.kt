package oop_00000090472_RafaelGadingSamoda.week02


import java.util.Scanner


class Hero(
    val name: String,
    val baseDamage: Int,
    var hp: Int = 100 // Default Argument = 100
) {
    // Simulasi serangan
    fun attack(targetName: String) {
        println("$name menebas $targetName!")
    }

    // Mengurangi HP diri sendiri
    fun takeDamage(damage: Int) {
        hp -= damage
        // Logika Wajib: HP tidak boleh tembus angka minus (minimal 0)
        if (hp < 0) {
            hp = 0
        }
    }

    // Cek apakah hero masih hidup
    fun isAlive(): Boolean {
        return hp > 0
    }
}

fun RPGmain() {
    val scanner = Scanner(System.`in`)

    println("=== MINI RPG BATTLE ===")
    print("Masukkan Nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan Base Damage Hero: ")
    val baseDamage = scanner.nextInt()

    // Instansiasi Hero (HP otomatis default 100)
    val hero = Hero(heroName, baseDamage)

    // Variabel Musuh
    var enemyHp = 100
    val enemyName = "Goblin"

    println("\nPertarungan Dimulai! $heroName vs $enemyName")
    println("----------------------------------------------")

    // Game Loop: Selama Hero hidup DAN Musuh hidup
    while (hero.isAlive() && enemyHp > 0) {
        println("\nStatus Saat Ini:")
        println("- ${hero.name} HP: ${hero.hp}")
        println("- $enemyName HP: $enemyHp")

        print("Pilih Aksi (1. Serang, 2. Kabur): ")
        val choice = scanner.nextInt()

        if (choice == 1) {
            // Hero menyerang musuh
            hero.attack(enemyName)
            enemyHp -= hero.baseDamage
            if (enemyHp < 0) enemyHp = 0
            println("Sisa HP $enemyName: $enemyHp")

            // Jika musuh masih hidup, musuh membalas!
            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                println("$enemyName membalas dengan $enemyDamage damage!")
                hero.takeDamage(enemyDamage)
                println("Sisa HP ${hero.name}: ${hero.hp}")
            }
        } else if (choice == 2) {
            println("${hero.name} memilih kabur dari pertarungan!")
            break
        } else {
            println("Pilihan tidak valid! Kamu kehilangan kesempatan menyerang.")
        }
    }

    // Pengumuman pemenang di luar loop
    println("\n=== PERTARUNGAN SELESAI ===")
    if (enemyHp <= 0) {
        println("Selamat! ${hero.name} berhasil mengalahkan $enemyName!")
    } else if (!hero.isAlive()) {
        println("Game Over! ${hero.name} telah gugur dalam pertarungan.")
    } else {
        println("Pertarungan berakhir karena ${hero.name} kabur.")
    }
}