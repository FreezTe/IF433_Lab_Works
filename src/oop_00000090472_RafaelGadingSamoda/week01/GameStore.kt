package oop_00000090472_RafaelGadingSamoda.week01
class classGame() {
    val gameTitle : String? = null
    val price : Long? = null
}

fun main(){
    var gameProduct : classGame? = null
}

fun discountLogic(price: Long): Double{

val realPrice = price
     return when {
        price > 500000 -> realPrice*(1.0-0.2)
    else ->  realPrice*(1.0-0.1)
    }
}