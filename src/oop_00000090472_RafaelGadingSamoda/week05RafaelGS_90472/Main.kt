package oop_00000090472_RafaelGadingSamoda.week05RafaelGS_90472

fun main() {
    val dosen1 = Dosen("Pak Alex", "0123456")
    val admin1 = Admin("Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for(pegawai in daftarPegawai) {
        pegawai.bekerja()

        when(pegawai){
            is Dosen -> {println("== Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn}")
            pegawai.mengajar()}
            is Admin ->{
                println("== Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("=====================================================")

    }

    // --- TUGAS MANDIRI 1: Test MathHelper (Overloading) ---
    val mathHelper = MathHelper_TM1()

    println("=== TEST MATH HELPER (OVERLOADING) ===")
    println("Luas persegi (sisi 5): ${mathHelper.hitungLuas(5)}")
    println("Luas persegi panjang (4 x 6): ${mathHelper.hitungLuas(4, 6)}")
    println("Luas lingkaran (jari-jari 3.0): ${mathHelper.hitungLuas(4.0)}")


    // --- TUGAS MANDIRI 2: Sistem Pembayaran (Abstraction & Smart Casting) ---
    val eWallet = EWalletTM2(accountName = "Andi", balance = 50000.0)
    val creditCard = CreditCardTM2(accountName = "Budi", limit = 100000.0)


}