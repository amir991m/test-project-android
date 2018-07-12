package com.example.grupa1.weatherapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface WeatherService {
    @GET("/data/2.5/weather?&appid=b6907d289e10d714a6e88b30761fae22")
    Call<Example> getWeather(@Query("q") String grad);
}
