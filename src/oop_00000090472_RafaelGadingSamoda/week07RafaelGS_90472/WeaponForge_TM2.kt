package oop_00000090472_RafaelGadingSamoda.week07RafaelGS_90472

class Weapon private constructor(val item: GameItem, val durability: Int) {

    companion object {
        fun forgeStarterSword(): Weapon {
            val item = GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON)
            return Weapon(item, 50)
        }

        fun forgeEpicSword(): Weapon {
            val item = GameItem("Pedang Excalibur", 150, ItemRarity.EPIC)
            return Weapon(item, 200)
        }
    }
}