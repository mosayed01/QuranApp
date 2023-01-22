package com.mosayed.quranapp.data.remote.util

import io.ktor.client.plugins.ClientRequestException
import io.ktor.client.plugins.RedirectResponseException
import io.ktor.client.plugins.ServerResponseException

suspend fun <T> tryToCall(call: suspend () -> List<T>): List<T> {
    return try {
        call()
    } catch (e: RedirectResponseException) {
        println("Error: ${e.response.status.description}")
        emptyList()
    } catch (e: ClientRequestException) {
        println("Error: ${e.response.status.description}")
        emptyList()
    } catch (e: ServerResponseException) {
        println("Error: ${e.response.status.description}")
        emptyList()
    } catch (e: Exception) {
        println("Error: ${e.message}")
        emptyList()
    }
}