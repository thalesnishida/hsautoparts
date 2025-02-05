package br.com.nishida.hsautocars.domain.value_objects

import br.com.nishida.hsautocars.exceptions.ValidationException

data class Car(
    val id: String,
    val referenceMonth: String,
    val classification: String,
    val brand: String,
    val module: String,
    val initialYear: String,
    val finalYear: String
) {
    init {
        if (id.isBlank()) {
            throw ValidationException("The Id cannot be empty")
        }
        if (initialYear.toInt() > finalYear.toInt()){
            throw ValidationException("Initial year cannot be greater than final year")
        }
    }
}
