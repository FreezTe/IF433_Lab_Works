package oop_00000090472_RafaelGadingSamoda.week09RafaelGS_90472

fun main(){
    println("=== TESTLAMBDA ===")

    val sumLambda = {a: Int, b: Int -> a + b}
    println("Hasil Sum: ${sumLambda(5,10)}")

    val squareImplicit: (Int) -> Int = {it * it}
    println("Hasil Square: ${squareImplicit(4)}")
}