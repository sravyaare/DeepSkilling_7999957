package com.cognizant.handon5.service;

import com.cognizant.handon5.model.Country;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountryService {

    public List<Country> getAllCountries() {

        List<Country> list = new ArrayList<>();

        list.add(new Country("IN", "India"));
        list.add(new Country("US", "United States"));
        list.add(new Country("JP", "Japan"));

        return list;
    }
}