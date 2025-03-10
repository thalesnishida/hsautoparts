package br.com.nishida.hsautocars.services.impl

import br.com.nishida.hsautocars.entity.AutoPart
import br.com.nishida.hsautocars.exceptions.ValidationException
import br.com.nishida.hsautocars.repository.AutoPartRepository
import br.com.nishida.hsautocars.services.AutoPartService
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class AutoPartServiceImpl(private val repositoryCarPart: AutoPartRepository) : AutoPartService {
    @Transactional
    override fun createCarPart(autoPart: AutoPart): AutoPart =  repositoryCarPart.save(autoPart)

    override fun getCarParts(): List<AutoPart>? = repositoryCarPart.findAll()

    @Transactional
    override fun deleteCarPartById(id: String) = repositoryCarPart.deleteById(id)

    @Transactional
    override fun updateCarPartById(id: String, updatedAutoPart: AutoPart): AutoPart {
        val carPart = repositoryCarPart.findById(id)

        if(carPart.isEmpty) {
            throw ValidationException("CarPart with id $id not exists")
        } else {
            return repositoryCarPart.save(updatedAutoPart)
        }
    }

    override fun findCarPartById(id: String): AutoPart? = repositoryCarPart.findById(id).orElse(null)
}