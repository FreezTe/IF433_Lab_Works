package oop_00000090472_RafaelGadingSamoda.week05RafaelGS_90472

class EWalletTM2 (accountName : String, var balance: Double) : PaymentMethodTM2(accountName){
    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("[$accountName] Pembayaran sebesar $amount berhasil. Sisa saldo: $balance")
        } else {
            println("[$accountName] Saldo tidak cukup untuk membayar $amount")
        }
    }


    fun topUp(amount: Double) {
        balance += amount
        println("[$accountName] Top up sebesar $amount berhasil. Saldo sekarang: $balance")
    }
}