package br.com.nishida.hsautocars.entity

import jakarta.persistence.*

@Entity
@Table(name = "AUTO_PARTS")
data class AutoPart(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long? = null,

    @Column(name = "REFERENCE_MONTH") val referenceMonth: String,

    @Column(name = "CLASSIFICATION") val classification: String,

    @Column(name = "BRAND") val brand: String,

    @Column(name = "MODULE") val module: String,

    @Column(name = "INITIAL_YEAR") val initialYear: String,

    @Column(name = "FINAL_YEAR") val finalYear: String,

    @Column(name = "GENUINE_CODE") val genuineCode: String,

    @Column(name = "PART_NAME") val partName: String,

    @Column(name = "CHARACTERISTIC") val characteristic: String? = null,

    @Column(name = "DIRECT_CORRELATION") val directCorrelation: String? = null,

    @Column(name = "POSITION_ONE") val positionOne: String? = null,

    @Column(name = "POSITION_TWO") val positionTwo: String? = null,

    @Column(name = "POSITION_THERE") val positionThree: String? = null,

    @Column(name = "POSITION_FOUR") val positionFour: String? = null,

    @Column(name = "CATEGORY_NCM") val categoryNCM: String,

    @Column(name = "SUB_CATEGORY_NCM") val subCategoryNCM: String,

    @Column(name = "PRODUCT_DESCRIPTION") val productDescription: String,

    @Column(name = "NCM_CODE") val ncmCode: String,

    @Column(name = "CEST_CODE") val cestCode: String? = null,

    @Column(name = "BAR_CODE") val barCode: String? = null,

    @Column(name = "WEIGHT") val weight: String,

    @Column(name = "HEIGHT") val height: String,

    @Column(name = "WIDTH") val width: String,

    @Column(name = "LENGTH") val length: String,
) {
    constructor() : this(
        null, "", "", "", "","","","", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""
    )
}
