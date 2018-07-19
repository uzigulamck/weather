package com.weather.queryWeather;

import com.weather.providers.IAmWeatherForecastProvider;

import java.util.List;

public class GetCurrentTemperatureHandler {

    private final List<IAmWeatherForecastProvider> weatherProviders;

    public GetCurrentTemperatureHandler(List<IAmWeatherForecastProvider> weatherProviders){
        this.weatherProviders = weatherProviders;
    }

    public ForecastResponse Handle(TemperatureRequest request) {

        return weatherProviders.stream()
                .filter(p->p.providerName(request.getProviderName()))
                .findFirst()
                .get()
                .getCurrentForecast(request.getCity());
    }
}
