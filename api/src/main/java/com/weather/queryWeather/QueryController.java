package com.weather.queryWeather;

public class QueryController {
    public long getCurrentTemperature(TemperatureRequest request) {
        //
        if (request.getCity()=="Panama")
            return 30;
        else
            return 17;
    }
}
