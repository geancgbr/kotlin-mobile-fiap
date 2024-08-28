package com.fiap.fiap_mobile_app.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.fiap.fiap_mobile_app.database.repository.WeatherRepository
import com.fiap.fiap_mobile_app.model.WeatherResponse
import kotlinx.coroutines.launch
import retrofit2.Response

class WeatherViewModel(private val repository: WeatherRepository) : ViewModel() {

    fun fetchWeather(city: String, apiKey: String, callback: (Response<WeatherResponse>) -> Unit) {
        viewModelScope.launch {
            val response = repository.getWeather(city, apiKey) //api key do openweather api se quiser trocar pode pegar em https://home.openweathermap.org/users/sign_up
            callback(response)
        }
    }
}
