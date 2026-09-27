package oop_00000090472_RafaelGadingSamoda.week05RafaelGS_90472

abstract class PaymentMethodTM2( val accountName : String) {

    abstract fun processPayment(amount: Double){}
}