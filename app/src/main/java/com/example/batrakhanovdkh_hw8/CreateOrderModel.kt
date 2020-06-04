package com.example.batrakhanov

/**
 * Модель для создания заказа
 */
data class CreateOrderModel(
    var firstName: String = "",
    var lastName: String = "",
    var middleName: String = "",
    var phoneNumber: String = ""
)