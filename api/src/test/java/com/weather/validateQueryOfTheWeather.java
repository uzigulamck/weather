package com.weather;

import com.weather.queryWeather.ForecastResponse;
import com.weather.queryWeather.QueryController;
import com.weather.queryWeather.TemperatureRequest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class validateQueryOfTheWeather {

    private QueryController sut;

    @Before
    public void before(){
        sut = new QueryController();
    }

    @Test
    public void shouldReturnCurrentTemperatureInPanamaCity(){

        ForecastResponse response = sut.getCurrentTemperature("Panama","weatherChannel.Api");

        Assert.assertEquals(30,response.getCurrentTemperature());
    }

    @Test
    public void shouldReturnCurrentTemperatureInLimaCity(){

        ForecastResponse response  = sut.getCurrentTemperature("Lima","weatherChannel.Api");

        Assert.assertEquals(17,response.getCurrentTemperature());
    }

    @Test
    public void shouldReturnCurrentTemperatureInLimaCityUsingWeatherChannelApi(){

        ForecastResponse response  = sut.getCurrentTemperature("Lima", "weatherChannel.Api");

        Assert.assertEquals(17,response.getCurrentTemperature());
    }

 /*   @Test
    public void shouldReturnCurrentTemperatureInLimaCityUsingForecastIo(){
        QueryController sut = new QueryController();

        long currentTemperature = sut.getCurrentTemperature("Lima", "forecastIO.Api");

        Assert.assertEquals(18,currentTemperature);
    }*/
}
