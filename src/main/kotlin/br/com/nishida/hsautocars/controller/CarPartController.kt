package br.com.nishida.hsautocars.controller

import br.com.nishida.hsautocars.entity.AutoPart
import br.com.nishida.hsautocars.services.AutoPartService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/api/carparts")
class CarPartController(val autoPartService: AutoPartService) {

    @GetMapping
    fun getCarParts(): List<AutoPart>? {
        return autoPartService.getCarParts()
    }

    @PostMapping
    fun createCarPart(@RequestBody autoPart: AutoPart): AutoPart {
        return autoPartService.createCarPart(autoPart)
    }

    @GetMapping("{id}")
    fun getCarPartById(@PathVariable id: String): AutoPart? {
        return autoPartService.findCarPartById(id)
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    fun deleteCarPartById(@PathVariable id: String) = autoPartService.deleteCarPartById(id)

    @PostMapping("/update/{id}")
    fun updateCarPart(@RequestBody autoPart: AutoPart, @PathVariable id: String): AutoPart =
        autoPartService.updateCarPartById(id, autoPart)
}