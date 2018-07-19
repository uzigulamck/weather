package com.weather.providers;

import com.weather.queryWeather.ForecastResponse;

public class WeatherChannelWeatherForecastProvider implements IAmWeatherForecastProvider{
    @Override
    public ForecastResponse getCurrentForecast(String city) {
        if (city.equalsIgnoreCase("panama"))
            return new ForecastResponse(30);
        return new ForecastResponse(17);
    }

    @Override
    public boolean providerName(String providerName) {
        return providerName.equalsIgnoreCase("weatherchannel.api");
    }
}
