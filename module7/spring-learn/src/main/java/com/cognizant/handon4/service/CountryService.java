package com.cognizant.handon4.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.cognizant.handon4.exception.CountryNotFoundException;
import com.cognizant.handon4.model.Country;
import com.cognizant.handon4.util.CountryUtil;

@Service
public class CountryService {

    public ArrayList<Country> getAllCountries() {
        return CountryUtil.getCountries();
    }

    public Country getCountry(String code) throws CountryNotFoundException {

        Country country = CountryUtil.getCountry(code);

        if (country == null) {
            throw new CountryNotFoundException();
        }

        return country;
    }
}