package fr.maif.handsonlabs.javaspringbootgraphql.controllers.api.v1;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import fr.maif.handsonlabs.javaspringbootgraphql.models.Continent;
import fr.maif.handsonlabs.javaspringbootgraphql.models.Country;
import fr.maif.handsonlabs.javaspringbootgraphql.services.ContinentService;
import fr.maif.handsonlabs.javaspringbootgraphql.services.CountryService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class Query implements GraphQLQueryResolver {

    private CountryService countryService;
    private ContinentService continentService;

    public Query(CountryService countryService, ContinentService continentService) {
        this.countryService = countryService;
        this.continentService = continentService;
    }

    public List<Country> countries() {
        return countryService.findAll();
    }

    public Optional<Country> country(String id) {
        return countryService.findById(id);
    }

    public List<Continent> continents() {
        return continentService.findAll();
    }
}
