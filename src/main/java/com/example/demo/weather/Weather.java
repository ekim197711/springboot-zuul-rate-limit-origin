package com.example.demo.weather;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Weather {
    private String weather;
    private Integer chance;
    private LocalDate date;
}
