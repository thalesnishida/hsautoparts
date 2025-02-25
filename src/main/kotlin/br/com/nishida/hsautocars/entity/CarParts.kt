package br.com.nishida.hsautocars.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "auto_parts")
data class AutoPart(
    @Id val id: String? = null,
    val genuineCode: String,
    val partName: String,
    val characteristic: String,
    val directCorrelation: String,
    val positionOne: String,
    val positionTwo: String,
    val positionThree: String,
    val positionFour: String,
    val categoryNCM: String,
    val subCategoryNCM: String,
    val productDescription: String,
    val ncmCode: String,
    val cestCode: String,
    val barCode: String,
    val weight: String,
    val height: String,
    val width: String,
    val length: String,
)
