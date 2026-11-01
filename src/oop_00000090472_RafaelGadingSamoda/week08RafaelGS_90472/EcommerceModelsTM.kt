package oop_00000090472_RafaelGadingSamoda.week08RafaelGS_90472

class EcommerceModels {
}

sealed class Product()
data class Electronic(val id: String, val name: String, val warrantyMonths: Int) : Product()

data class Clothing(val id: String, val name: String, val size: String) : Product()