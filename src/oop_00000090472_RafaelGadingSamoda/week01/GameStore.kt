package oop_00000090472_RafaelGadingSamoda.week01
class ClassGame(val gameTitle : String? = null,
                val price : Long)

class Receipt(val receiptId : Int, val game : ClassGame, val finalPrice : Double, val custNote : String?){
    fun printReceipt(){
        val note = custNote ?: "EMPTY"
        println("=== STRUK PEMBELIAN ===")
        println("ID Struk    : $receiptId")
        println("Judul Game  : ${game.gameTitle}")
        println("Harga Asli  : Rp${game.price}")
        println("Harga Total : Rp$finalPrice")
        println("Note : $note")
    }
}



fun main(){
    val gameProduct = ClassGame(
        gameTitle = "Elden Ring",
        price = 600000L
    )
    var userNote : String? = null
    var receiptId : Int = 1
    var discountedPrice = discountLogic(price = gameProduct.price)
    val Receipt = Receipt(receiptId = receiptId, game = gameProduct, finalPrice = discountedPrice, custNote = userNote)

    Receipt.printReceipt()

}





fun discountLogic(price: Long): Double{
val realPrice = price.toDouble()
     return when {
        price > 500000 -> realPrice*(1.0-0.2)
    else ->  realPrice*(1.0-0.1)
    }
}