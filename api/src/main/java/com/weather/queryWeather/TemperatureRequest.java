package com.weather.queryWeather;


public final class TemperatureRequest {

    public TemperatureRequest(String city, String providerName){
        this.city = city;
        this.providerName=providerName;
    }
    private String city;
    private String providerName;

    public String getCity(){return city;}
    public String getProviderName(){return providerName;}
}
