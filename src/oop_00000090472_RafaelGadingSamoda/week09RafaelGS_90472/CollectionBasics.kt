package oop_00000090472_RafaelGadingSamoda.week09RafaelGS_90472

fun main(){
    println("=== TEST LIST ===")
    val framework: List<String> = listOf("Kotlin", "Java", "C++")
    println("Immutable List: $framework")

    val scores: MutableList<Int> = mutableListOf(85, 90)
    scores.add(95)
    scores[0] = 88
    println("Mutable List: $scores")

    println("\n === TEST SET ===")
    val uniqueNumbers = setOf(1,2,2,3,3,4)
    println("Unique Numbers (Set): $uniqueNumbers")

    val activeUsers = mutableSetOf("UserA", "UserB")
    activeUsers.add("UserA")
    activeUsers.add("UserA")
    println("Active Users: $activeUsers")

    println("\n === TEST MAP ===")
    val studentGrades = mapOf("Alice" to "A",
        "Bob" to "B",
        "Charlie" to "A")
    println("NIlai Bob: ${studentGrades["Bob"]}")
    val inventory = mutableMapOf("Apples" to 50, "Bananas" to 30)
    inventory["Oranges"] = 20
    inventory["Apples"] = 45
    println("Inventory: $inventory")
}