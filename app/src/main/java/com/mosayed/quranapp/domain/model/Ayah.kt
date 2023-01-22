package com.mosayed.quranapp.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class Ayah(
    val arabic_text: String,
    val aya: String,
    val footnotes: String,
    val id: String,
    val sura: String,
    val translation: String
)