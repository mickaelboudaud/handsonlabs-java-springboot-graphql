package fr.maif.handsonlabs.javaspringbootgraphql.controllers.api.v1;

import fr.maif.handsonlabs.javaspringbootgraphql.models.Country;
import fr.maif.handsonlabs.javaspringbootgraphql.services.CountryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/countries")
public class CountryController {

    private CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping()
    public Iterable<Country> findAll() {
        return countryService.findAll();
    }
}
