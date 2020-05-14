package com.example.demo.weather;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class WeatherRestController {

    @GetMapping("/weather")
    public Weather weather(){
        return new Weather("Sunny", 50, LocalDate.now());
    }

}
