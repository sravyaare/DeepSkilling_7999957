package com.cognizant.handon4.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

import com.cognizant.handon4.exception.CountryNotFoundException;
import com.cognizant.handon4.model.Country;
import com.cognizant.handon4.service.CountryService;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping
    public ArrayList<Country> getAllCountries() {

        return countryService.getAllCountries();

    }

    @GetMapping("/{code}")
    public Country getCountry(@PathVariable String code)
            throws CountryNotFoundException {

        return countryService.getCountry(code);

    }

    @PostMapping
    public Country addCountry(@RequestBody @Valid Country country) {

        return country;

    }

}