package fr.maif.handsonlabs.javaspringbootgraphql.services;

import fr.maif.handsonlabs.javaspringbootgraphql.models.Continent;
import fr.maif.handsonlabs.javaspringbootgraphql.services.repositories.ContinentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContinentService {

    private ContinentRepository continentRepository;

    public ContinentService(ContinentRepository continentRepository) {
        this.continentRepository = continentRepository;
    }

    public List<Continent> findAll() {
        return continentRepository.findAll();
    }
}
