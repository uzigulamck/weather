package com.weather.queryWeather;

import lombok.Getter;

@Getter
public class ForecastResponse {
    private final int currentTemperature;

    public ForecastResponse(int currentTemperature) {
        this.currentTemperature = currentTemperature;
    }
}
