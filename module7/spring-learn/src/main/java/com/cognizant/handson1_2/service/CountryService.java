package com.cognizant.handson1_2.service;

import com.cognizant.handson1_2.Country;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    public Country getCountry() {

        return new Country("IN", "India");

    }

}