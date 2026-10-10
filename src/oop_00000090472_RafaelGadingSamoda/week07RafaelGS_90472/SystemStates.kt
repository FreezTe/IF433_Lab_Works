package oop_00000090472_RafaelGadingSamoda.week07RafaelGS_90472

class SystemStates {
}

sealed class ApiResponse{
    data class Success(val data: String) : ApiResponse()
    data class Error(val massage: String) : ApiResponse()
    object Loading : ApiResponse()
}