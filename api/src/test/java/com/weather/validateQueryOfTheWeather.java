package com.weather;

import com.weather.queryWeather.QueryController;
import com.weather.queryWeather.TemperatureRequest;
import org.junit.Assert;
import org.junit.Test;


public class validateQueryOfTheWeather {
    @Test
    public void canaryTest(){

        QueryController sut = new QueryController();
        Assert.assertNotNull(sut);

    }

    @Test
    public void shouldReturnCurrentTemperatureInPanamaCity(){
        QueryController sut = new QueryController();

        long currentTemperature = sut.getCurrentTemperature(new TemperatureRequest("Panama","weatherChannel.Api"));

        Assert.assertEquals(30,currentTemperature);
    }

    @Test
    public void shouldReturnCurrentTemperatureInLimaCity(){
        QueryController sut = new QueryController();

        long currentTemperature = sut.getCurrentTemperature(new TemperatureRequest("Lima","weatherChannel.Api"));

        Assert.assertEquals(17,currentTemperature);
    }

    @Test
    public void shouldReturnCurrentTemperatureInLimaCityUsingWeatherChannelApi(){
        QueryController sut = new QueryController();

        long currentTemperature = sut.getCurrentTemperature(new TemperatureRequest("Lima", "weatherChannel.Api"));

        Assert.assertEquals(17,currentTemperature);
    }

    @Test
    public void shouldReturnCurrentTemperatureInLimaCityUsingForecastIo(){
        QueryController sut = new QueryController();

        long currentTemperature = sut.getCurrentTemperature(new TemperatureRequest("Lima", "forecastIO.Api"));

        Assert.assertEquals(18,currentTemperature);
    }
}
