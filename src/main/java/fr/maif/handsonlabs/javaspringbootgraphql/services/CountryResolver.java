package fr.maif.handsonlabs.javaspringbootgraphql.services;

import com.coxautodev.graphql.tools.GraphQLResolver;
import fr.maif.handsonlabs.javaspringbootgraphql.models.Continent;
import fr.maif.handsonlabs.javaspringbootgraphql.models.Country;
import fr.maif.handsonlabs.javaspringbootgraphql.models.Language;
import fr.maif.handsonlabs.javaspringbootgraphql.services.repositories.ContinentRepository;
import fr.maif.handsonlabs.javaspringbootgraphql.services.repositories.LanguageRepository;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Component
public class CountryResolver implements GraphQLResolver<Country> {

    private ContinentRepository continentRepository;

    private LanguageRepository languageRepository;

    public CountryResolver(ContinentRepository continentRepository, LanguageRepository languageRepository) {
        this.continentRepository = continentRepository;
        this.languageRepository = languageRepository;
    }
    
    public Optional<Continent> continent(Country country) {
        return continentRepository.findById(country.getContinentId());
    }

    @Transactional
    public List<Language> languages(Country country) {
        final Set<String> languageIds = country.getLanguageIds();
        return languageRepository.findAllById(languageIds);
    }
}
