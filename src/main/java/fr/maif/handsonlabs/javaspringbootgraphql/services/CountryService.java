package fr.maif.handsonlabs.javaspringbootgraphql.services;

import fr.maif.handsonlabs.javaspringbootgraphql.models.Country;
import fr.maif.handsonlabs.javaspringbootgraphql.models.Area;
import fr.maif.handsonlabs.javaspringbootgraphql.services.repositories.CountryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    private CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public Optional<Country> findById(String id) {
        return countryRepository.findById(id);
    }

    public List<Country> findAll() {
        return countryRepository.findAll();
    }

    public Country editCountryArea(String countryId, Area area) {
        final Optional<Country> maybeCountry = countryRepository.findById(countryId);

        if (!maybeCountry.isPresent()) {
            throw new IllegalArgumentException("Can not find the country to edit");
        }

        final Country country = maybeCountry.get();
        country.setArea(area);
        return countryRepository.save(country);
    }
}
