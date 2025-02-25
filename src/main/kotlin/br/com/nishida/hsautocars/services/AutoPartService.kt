package br.com.nishida.hsautocars.services

import br.com.nishida.hsautocars.entity.AutoPart

interface AutoPartService {
    fun createCarPart(autoPart: AutoPart): AutoPart
    fun getCarParts(): List<AutoPart>?
    fun deleteCarPartById(id: String)
    fun updateCarPartById(id: String, updatedAutoPart: AutoPart) : AutoPart
    fun findCarPartById(id: String): AutoPart?
}