package com.weather.queryWeather;

import java.util.List;

public class GetCurrentTemperatureHandler {


    public ForecastResponse Handle(TemperatureRequest request) {

        if (request.getCity()=="Panama")
            return new ForecastResponse(30);
        return new ForecastResponse(17);
    }
}
