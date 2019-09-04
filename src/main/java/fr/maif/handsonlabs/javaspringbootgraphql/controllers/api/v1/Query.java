package fr.maif.handsonlabs.javaspringbootgraphql.controllers.api.v1;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import fr.maif.handsonlabs.javaspringbootgraphql.models.Country;
import fr.maif.handsonlabs.javaspringbootgraphql.services.CountryService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Query implements GraphQLQueryResolver {

    private CountryService countryService;

    public Query(CountryService countryService) {
        this.countryService = countryService;
    }

    public List<Country> countries() {
        return (countryService.findAll());
    }
}
