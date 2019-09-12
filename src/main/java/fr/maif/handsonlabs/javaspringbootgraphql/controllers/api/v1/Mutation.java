package fr.maif.handsonlabs.javaspringbootgraphql.controllers.api.v1;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import fr.maif.handsonlabs.javaspringbootgraphql.models.Country;
import fr.maif.handsonlabs.javaspringbootgraphql.models.Area;
import fr.maif.handsonlabs.javaspringbootgraphql.services.CountryService;
import org.springframework.stereotype.Component;

@Component
public class Mutation implements GraphQLMutationResolver {

    private CountryService countryService;

    public Mutation(CountryService countryService) {
        this.countryService = countryService;
    }

    public Country editCountryArea(String countryId, Area area) {
        return countryService.editCountryArea(countryId, area);
    }
}
