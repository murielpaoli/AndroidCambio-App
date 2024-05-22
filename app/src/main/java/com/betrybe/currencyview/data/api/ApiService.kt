package com.betrybe.currencyview.data.api

import com.betrybe.currencyview.data.models.CurrencySymbolResponse
import com.betrybe.currencyview.data.models.CurrencyRateResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface ApiService {
    @Headers("apiKey: ihA3jQcGS4GxnvCIWyWf1bwty4A434o0")
    @GET("symbols")
    suspend fun getSymbol(): Response<CurrencySymbolResponse>

    @Headers("apiKey: ihA3jQcGS4GxnvCIWyWf1bwty4A434o0")
    @GET("latest")
    suspend fun getLatestRates(@Query("base") base: String): Response<CurrencyRateResponse>
}
