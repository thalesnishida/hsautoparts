package br.com.nishida.hsautocars.repository

import br.com.nishida.hsautocars.entity.AutoPart
import org.springframework.data.mongodb.repository.MongoRepository

interface AutoPartRepository : MongoRepository<AutoPart, String> {
}