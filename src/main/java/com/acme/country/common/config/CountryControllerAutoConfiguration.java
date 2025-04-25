package com.acme.country.common.config;

import com.acme.country.controller.api.v1.CountryController;
import com.acme.country.service.CountryService;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * Holds the bean creation to configure.
 *
 * @author COQ - Carlos Adolfo Ortiz Q.
 */
@AutoConfiguration
public class CountryControllerAutoConfiguration {

    @Bean
    public CountryController countryController(CountryService countryService) {
        return new CountryController(countryService);
    }
}
