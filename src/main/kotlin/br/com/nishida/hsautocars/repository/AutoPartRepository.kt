package br.com.nishida.hsautocars.repository

import br.com.nishida.hsautocars.entity.AutoPart
import org.springframework.data.jpa.repository.JpaRepository

interface AutoPartRepository : JpaRepository<AutoPart, String> {
}