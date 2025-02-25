package br.com.nishida.hsautocars.domain.value_objects

import br.com.nishida.hsautocars.entity.Car
import br.com.nishida.hsautocars.exceptions.ValidationException
import org.junit.jupiter.api.assertThrows
import org.springframework.boot.test.context.SpringBootTest
import kotlin.test.Test
import kotlin.test.assertEquals

@SpringBootTest
class CarTest {

    @Test
    fun `should create a new instance of Car when params is correct`() {
        val id = "!)IC*A+CACASOD"
        val referenceMonth = "dezembro/2024"
        val classification = "Carros e utilitarios"
        val brand = "Fiat"
        val module = "Sedan"
        val initialYear = "2012"
        val finalYear = "2013"

        val car = Car(id, referenceMonth, classification, brand, module, initialYear, finalYear)

        assertEquals(id, car.id)
        assertEquals(referenceMonth, car.referenceMonth)
        assertEquals(classification, car.classification)
        assertEquals(brand, car.brand)
        assertEquals(module, car.module)
        assertEquals(initialYear, car.initialYear)
        assertEquals(finalYear, car.finalYear)
    }

    @Test
    fun `should throw ValidationException when ID is empty `() {
        val exception = assertThrows<ValidationException> {
            Car(
                id = "",
                referenceMonth = "dezembro/2024",
                classification = "Carros e utilitarios",
                brand = "Fiat",
                module = "Sedan",
                initialYear = "2012",
                finalYear = "2013"
            )
        }
        assertEquals("The Id cannot be empty", exception.message)
    }

    @Test
    fun `should throw ValidationException when finalYear is before initialYear `(){
        val exception = assertThrows<ValidationException> {
            Car(
                id = "JASJDN@KNA",
                referenceMonth = "dezembro/2024",
                classification = "Carros e utilitarios",
                brand = "Fiat",
                module = "Sedan",
                initialYear = "2013",
                finalYear = "2012"
            )
        }

        assertEquals("Initial year cannot be greater than final year", exception.message)
    }
}