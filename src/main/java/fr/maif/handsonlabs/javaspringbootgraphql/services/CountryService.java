package fr.maif.handsonlabs.javaspringbootgraphql.services;

import fr.maif.handsonlabs.javaspringbootgraphql.models.Country;
import fr.maif.handsonlabs.javaspringbootgraphql.services.repositories.CountryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    private CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public List<Country> findAll() {
        return countryRepository.findAll();
    }
}
