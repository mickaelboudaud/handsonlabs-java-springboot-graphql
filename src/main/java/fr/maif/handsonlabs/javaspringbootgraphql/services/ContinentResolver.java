package fr.maif.handsonlabs.javaspringbootgraphql.services;

import com.coxautodev.graphql.tools.GraphQLResolver;
import fr.maif.handsonlabs.javaspringbootgraphql.models.Continent;
import fr.maif.handsonlabs.javaspringbootgraphql.models.Country;
import fr.maif.handsonlabs.javaspringbootgraphql.models.Language;
import fr.maif.handsonlabs.javaspringbootgraphql.services.repositories.ContinentRepository;
import fr.maif.handsonlabs.javaspringbootgraphql.services.repositories.CountryRepository;
import fr.maif.handsonlabs.javaspringbootgraphql.services.repositories.LanguageRepository;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Component
public class ContinentResolver implements GraphQLResolver<Continent> {

    private CountryRepository countryRepository;

    public ContinentResolver(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public List<Country> countries(Continent continent) {
        return countryRepository.findByContinentId(continent.getId());
    }
}
