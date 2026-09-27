package oop_00000090472_RafaelGadingSamoda.week05RafaelGS_90472

class CreditCardTM2 (accountName: String, val limit: Double) : PaymentMethodTM2(accountName) {

    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("[$accountName] Pembayaran sebesar $amount berhasil. Total terpakai: $usedAmount / $limit")
        } else {
            println("[$accountName] Transaksi ditolak, melebihi limit kartu kredit")
        }
    }
}