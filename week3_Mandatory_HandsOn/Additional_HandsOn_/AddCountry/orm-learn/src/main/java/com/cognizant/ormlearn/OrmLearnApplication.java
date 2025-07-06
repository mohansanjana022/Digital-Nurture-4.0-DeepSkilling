package com.cognizant.ormlearn;
import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OrmLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
    private static CountryService countryService;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
        countryService = context.getBean(CountryService.class);

        testAddCountry(); // <--- Call the new method
    }

    private static void testAddCountry() {
        LOGGER.info("Start - testAddCountry");

        // Step 1: Create new country
        Country newCountry = new Country();
        newCountry.setCode("JP");
        newCountry.setName("Japan");

        // Step 2: Add the country to DB
        countryService.addCountry(newCountry);

        // Step 3: Retrieve it back
        Country retrievedCountry = countryService.findCountryByCode("JP");
        LOGGER.debug("Retrieved Country: {}", retrievedCountry);

        LOGGER.info("End - testAddCountry");
    }
}
