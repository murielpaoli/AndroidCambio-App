package com.betrybe.currencyview.data.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

const val baseUrl = "https://api.apilayer.com/exchangerates_data/"
object ApiManager {
    val instance: ApiService by lazy {
        val retrofit = Retrofit.Builder().baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create()).build()
        retrofit.create(ApiService::class.java)
    }
}