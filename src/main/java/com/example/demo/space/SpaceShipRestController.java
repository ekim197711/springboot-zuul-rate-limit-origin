package com.example.demo.space;

import com.example.demo.weather.Weather;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class SpaceShipRestController {

    @GetMapping("/spaceship")
    public SpaceShip spaceship(){
        return new SpaceShip("Round and noisy", 88);
    }

}
