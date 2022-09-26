package com.mosayed.quranapp.model

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

