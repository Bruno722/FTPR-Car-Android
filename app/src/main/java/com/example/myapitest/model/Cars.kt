package com.example.myapitest.model

// Feito novo model para se adequar a API que retorna dois tipos de objetos diferentes.
// No Get/car/id - Retorna um objeto encapsulado
// Já no Get/car - Retorna somente o objeto

data class Cars (
val id: String,
val imageUrl: String,
val year: String,
val name: String,
val licence: String,
val place: CarLocation
)

data class CarLocation (
    val lat: Double,
    val long: Double
)