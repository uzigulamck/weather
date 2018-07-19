package com.weather.providers;

import com.weather.queryWeather.ForecastResponse;

public interface IAmWeatherForecastProvider {
    ForecastResponse getCurrentForecast(String city);

    boolean providerName(String providerName);
}
