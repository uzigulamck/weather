package com.weather.queryWeather;

import com.weather.providers.ForecastIOWeatherForecastProvider;
import com.weather.providers.IAmWeatherForecastProvider;
import com.weather.providers.WeatherChannelWeatherForecastProvider;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/query")
@RestController
public class QueryController {

    @RequestMapping(value = "/{city}/{provider}", method = RequestMethod.GET)
    public ForecastResponse getCurrentTemperature(@PathVariable String city, @PathVariable String provider) {
        //
        TemperatureRequest request = new TemperatureRequest(city,provider);

        return new GetCurrentTemperatureHandler(getProviderList()).Handle(request);

    }

    private List<IAmWeatherForecastProvider> getProviderList() {
        ArrayList<IAmWeatherForecastProvider> providers = new ArrayList<IAmWeatherForecastProvider>();
        providers.add(new WeatherChannelWeatherForecastProvider());
        providers.add(new ForecastIOWeatherForecastProvider());
        return providers;
    }
}
