package com.cognizant.handon4.util;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.handon4.model.Country;

public class CountryUtil {

    @SuppressWarnings("unchecked")
    private static ArrayList<Country> countryList;

    static {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        countryList = (ArrayList<Country>) context.getBean("countryList");

    }

    public static ArrayList<Country> getCountries() {
        return countryList;
    }

    public static Country getCountry(String code) {

        for (Country country : countryList) {
            if (country.getCode().equalsIgnoreCase(code)) {
                return country;
            }
        }

        return null;
    }
}