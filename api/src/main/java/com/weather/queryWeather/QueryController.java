package com.weather.queryWeather;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/query")
@RestController
public class QueryController {

    @RequestMapping(value = "/{city}/{provider}", method = RequestMethod.GET)
    public ForecastResponse getCurrentTemperature(@PathVariable String city, @PathVariable String provider) {
        //
        TemperatureRequest request = new TemperatureRequest(city,provider);

        return new GetCurrentTemperatureHandler().Handle(request);

    }
}
