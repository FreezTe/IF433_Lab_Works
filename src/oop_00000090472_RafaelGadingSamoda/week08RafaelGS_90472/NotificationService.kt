package oop_00000090472_RafaelGadingSamoda.week08RafaelGS_90472

class NotificationService {
    fun sendEmail(emailAddress: String){
        println("Mengirim email ke : $emailAddress")
    }
    fun processUser(user: UserProfile){
        if (user.email != null){
            sendEmail(user.email)
        }else{
            println("User ${user.name} tidak memiliki email.")
        }
    }
}