package oop_00000090472_RafaelGadingSamoda.week07RafaelGS_90472

class GameModels_TM2 {
}
enum class ItemRarity(val dropChance: Int) {
    COMMON(70),
    UNCOMMON(20),
    RARE(7),
    EPIC(2),
    LEGENDARY(1)
}
data class GameItem(
    val name: String,
    val damage: Int,
    val rarity: ItemRarity
)