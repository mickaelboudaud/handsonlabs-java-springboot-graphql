package fr.maif.handsonlabs.javaspringbootgraphql.services;

import fr.maif.handsonlabs.javaspringbootgraphql.models.Country;
import fr.maif.handsonlabs.javaspringbootgraphql.services.repositories.CountryRepository;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    private CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public Iterable<Country> findAll() {
        return countryRepository.findAll();
    }
}
