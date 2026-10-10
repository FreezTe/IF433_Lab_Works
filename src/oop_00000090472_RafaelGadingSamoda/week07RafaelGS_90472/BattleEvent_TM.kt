package oop_00000090472_RafaelGadingSamoda.week07RafaelGS_90472

sealed class BattleState {
    data class MonsterEncounter(val monsterName: String) : BattleState()
    data class LootDropped(val item: GameItem) : BattleState()
    data class GameOver(val reason: String) : BattleState()
    object SafeZone : BattleState() // tanpa payload, hanya penanda status aman
}