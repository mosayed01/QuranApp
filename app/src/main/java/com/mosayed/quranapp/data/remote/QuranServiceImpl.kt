package com.mosayed.quranapp.data.remote

import com.mosayed.quranapp.data.remote.util.HttpRouts
import com.mosayed.quranapp.data.remote.util.tryToCall
import com.mosayed.quranapp.domain.model.Ayah
import com.mosayed.quranapp.domain.model.Sura
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.request.url

class QuranServiceImpl(
    private val client: HttpClient
) : QuranService {
    override suspend fun getSura(): List<Sura> {
        return tryToCall { client.get { url(HttpRouts.BASE_URL_SURA) } as List<Sura> }
    }

    override suspend fun getAyat(number: Int): List<Ayah> {
        return tryToCall { client.get { url(HttpRouts.getAyatBySuraNumber(number)) } as List<Ayah> }
    }
}