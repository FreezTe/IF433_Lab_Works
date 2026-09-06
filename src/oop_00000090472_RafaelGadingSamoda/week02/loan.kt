package oop_00000090472_RafaelGadingSamoda.week02
import java.util.Scanner

class Book (
    var bookTitle : String,
    var borrower : String,
    var loanDuration : Int = 1,
    ){

    fun calculateFine() : Int {

        return if (loanDuration > 3)
        {
            (loanDuration - 3) * 2000
        }else{
            0
        }
    }

}

fun loan(){
    val scanner = Scanner(System.`in`)

    println("=== SISTEM PEMINJAMAN PERPUSTAKAAN ===")
    print("Masukkan Judul Buku   : ")
    val bookTitle = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukkan Lama Pinjam (Hari): ")
    var duration = scanner.nextInt()

    // Validasi: Lama pinjam tidak boleh minus. Jika minus, ubah menjadi 1 hari.
    if (duration < 0) {
        println("WARNING: Lama pinjam tidak valid. Otomatis diubah menjadi 1 hari.")
        duration = 1
    }

    // Instansiasi Objek Loan
    val loan = Book(bookTitle, borrower, loanDuration = duration)

    // Tampilkan Detail Peminjaman & Total Denda
    println("\n=== DETAIL PEMINJAMAN ===")
    println("Judul Buku  : ${loan.bookTitle}")
    println("Peminjam    : ${loan.borrower}")
    println("Lama Pinjam : ${loan.loanDuration} hari")
    println("Total Denda : Rp ${loan.calculateFine()}")
}

