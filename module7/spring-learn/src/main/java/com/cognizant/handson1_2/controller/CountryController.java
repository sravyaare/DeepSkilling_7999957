package com.cognizant.handson1_2.controller;

import com.cognizant.handson1_2.Country;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @RequestMapping("/country")
    public Country getCountryIndia() {
        return new Country("IN", "India");
    }
}