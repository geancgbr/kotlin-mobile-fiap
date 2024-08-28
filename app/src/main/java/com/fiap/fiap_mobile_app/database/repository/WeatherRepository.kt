package com.fiap.fiap_mobile_app.database.repository

import com.fiap.fiap_mobile_app.model.WeatherResponse
import com.fiap.fiap_mobile_app.service.RetrofitFactory
import retrofit2.Response

class WeatherRepository {

    private val weatherApiService = RetrofitFactory.create()

    suspend fun getWeather(city: String, apiKey: String): Response<WeatherResponse> {
        return weatherApiService.getWeather(city, apiKey)
    }
}

/*
- instancia de retrofitfactory para configuracao das rotas da API, pois somente a factory sabe como acessar a API
- funcao assincrona como as explicadas no dao (suspend) para capturar a resposta da api
 */
