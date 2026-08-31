package oop_00000090472_RafaelGadingSamoda.week01

fun main(){

    val radius = 7.0
    val pi = 14.0

    var area: Double = pi * radius * radius


    println("Radius: $radius , Area: $area")

    println("Checker: ${checker(area)} ${checkSize(area)}")
}

fun checkSize(area: Double) : String {
    return when  {
        area > 100 -> "Big Circle"
        else -> "Small Circle"
    }

}

fun checker(area: Double) : String {
  return when {
     area >= 150 -> "Large"
     area >= 50 -> "Medium"
     else -> "Small"
 }
}