package com.mosayed.quranapp.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class Sura(
    val englishName: String,
    val englishNameTranslation: String,
    val name: String,
    val number: Int,
    val numberOfAyahs: Int,
    val revelationType: String
) {
    fun numWithRevelation() = "$revelationType, ${numberOfAyahs}Ayat"
}

