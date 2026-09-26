package oop_00000090472_RafaelGadingSamoda.week05RafaelGS_90472

class Admin(nama: String) : Pegawai(nama) {
    override fun bekerja() {
        println("{$nama} sedang duduk di depan komputer melayani administrasi")
    }

    fun doAdminWork(){
        println("{$nama} sedang merekap data absensi mahasiswa")
    }
}