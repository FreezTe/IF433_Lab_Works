package oop_00000090472_RafaelGadingSamoda.week08RafaelGS_90472

class City(val name: String)
class Address(val city: City?,)
class DeliveryDetails(val address: Address?)
class Order(val deliveryDetails: DeliveryDetails?, val totalPrice: Int?)