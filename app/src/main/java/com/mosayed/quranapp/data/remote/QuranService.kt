package com.mosayed.quranapp.data.remote

import com.mosayed.quranapp.domain.model.Ayah
import com.mosayed.quranapp.domain.model.Sura

interface QuranService {

    suspend fun getSura(): List<Sura>
    suspend fun getAyat(number: Int): List<Ayah>
}