package oop_00000090472_RafaelGadingSamoda.week07RafaelGS_90472

fun main (){


    println("=== TEST SINNGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()


//    println("\n=== TEST REGULAR CLASS ===")
//    val reg1 = RegulerUser("Alice",22)
//    val reg2 = RegulerUser("Alice",22)
//    println(reg1) //akan mencetak memori hash
//    println ("Sama? $reg1 == $reg2") // false

    println("\n=== TEST REGULAR CLASS ===")
    val data1 = DataUser("Alice",22)
    val data2 = DataUser("Alice",22)
    println(data1) //akan readable format
    println ("Sama? $data1 == $data2") // True


    val data3 = data1.copy(age = 23)
    println("Hasil copy : $data3")

    val (userName, userAge) = data1
    println("Destructured: $userName berumur $userAge")

    println("\n=== TEST SEALED CLASS ===")
    val response: ApiResponse = ApiResponse.Success("data berhasil ditarik!")

    val uiMassage = when (response) {
        is ApiResponse.Success -> "Tampilkan : ${response.data}"
        is ApiResponse.Error -> "Munculkan alert : ${response.massage}"
    }
}