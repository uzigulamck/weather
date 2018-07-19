package com.weather.queryWeather;

import lombok.Getter;
import lombok.Setter;

@Getter

public final class TemperatureRequest {

    public TemperatureRequest(String city, String providerName){
        this.city = city;
        this.providerName=providerName;
    }
    private String city;
    private String providerName;

}
