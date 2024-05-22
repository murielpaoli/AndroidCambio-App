package com.betrybe.currencyview.data.repository

import com.betrybe.currencyview.data.api.ApiManager
import com.betrybe.currencyview.common.ApiIdlingResource
import retrofit2.HttpException
import java.io.IOException

class CurrencyRepository {
    private val currencyService = ApiManager.instance

    suspend fun fetchSymbols(): Result<Map<String, String>> {
        return try {
            ApiIdlingResource.increment()
            val response = currencyService.getSymbol()
            ApiIdlingResource.decrement()
            if (response.isSuccessful) {
                Result.success(response.body()?.symbols ?: emptyMap())
            } else {
                Result.failure(Exception("Failed to fetch symbols"))
            }
        } catch (e: HttpException) {
            ApiIdlingResource.decrement()
            Result.failure(e)
        } catch (e: IOException) {
            ApiIdlingResource.decrement()
            Result.failure(e)
        }
    }

    suspend fun fetchLatestRates(symbol: String): Result<Map<String, Double>> {
        return try {
            ApiIdlingResource.increment()
            val response = currencyService.getLatestRates(symbol)
            ApiIdlingResource.decrement()
            if (response.isSuccessful) {
                Result.success(response.body()?.rates ?: emptyMap())
            } else {
                Result.failure(Exception("Failed to fetch latest rates"))
            }
        } catch (e: HttpException) {
            ApiIdlingResource.decrement()
            Result.failure(e)
        } catch (e: IOException) {
            ApiIdlingResource.decrement()
            Result.failure(e)
        }
    }
}