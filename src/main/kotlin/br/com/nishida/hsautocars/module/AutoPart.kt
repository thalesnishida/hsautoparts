package br.com.nishida.hsautocars.module

import br.com.nishida.hsautocars.entity.Car
import br.com.nishida.hsautocars.entity.AutoPart

data class AutoPart (
    val car : Car,
    val autoPart: AutoPart
)