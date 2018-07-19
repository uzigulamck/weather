package com.weather.providers;

import com.weather.queryWeather.ForecastResponse;

public class ForecastIOWeatherForecastProvider implements IAmWeatherForecastProvider {
    @Override
    public ForecastResponse getCurrentForecast(String city) {
        return new ForecastResponse(18); // apifore
    }

    @Override
    public boolean providerName(String providerName) {
        return providerName.equalsIgnoreCase("forecastIO.api");
    }
}
