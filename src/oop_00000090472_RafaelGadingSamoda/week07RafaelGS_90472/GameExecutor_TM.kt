package oop_00000090472_RafaelGadingSamoda.week07RafaelGS_90472

fun processEvent(event: BattleState) {
    // when pada sealed class harus exhaustive: semua turunan wajib tercakup
    when (event) {
        is BattleState.SafeZone -> {
            println("Kamu berada di Safe Zone. Aman untuk beristirahat.")
        }
        is BattleState.MonsterEncounter -> {
            // Smart cast: event otomatis bertipe MonsterEncounter di sini
            println("Awas! Kamu bertemu monster: ${event.monsterName}. Bersiap bertarung!")
        }
        is BattleState.LootDropped -> {
            // Destructuring payload dari data class
            val (item) = event
            println("Loot didapat: ${item.name} (Damage ${item.damage}, Rarity ${item.rarity})")
        }
        is BattleState.GameOver -> {
            println("GAME OVER. Alasan: ${event.reason}")
        }
    }
}