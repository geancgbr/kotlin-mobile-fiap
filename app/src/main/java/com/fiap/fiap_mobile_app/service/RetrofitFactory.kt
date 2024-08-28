package com.fiap.fiap_mobile_app.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitFactory {

    private const val BASE_URL = "https://api.openweathermap.org/data/2.5/"

    fun create(): WeatherApiService {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(WeatherApiService::class.java)
    }
}

/*
- centralizacao de configuracao da API.
 */