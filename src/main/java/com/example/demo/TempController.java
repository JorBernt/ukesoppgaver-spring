package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TempController {
    @GetMapping("/")
    public String Temp(String maned) {
        return Temperatur.getTemp(maned);
    }
}
