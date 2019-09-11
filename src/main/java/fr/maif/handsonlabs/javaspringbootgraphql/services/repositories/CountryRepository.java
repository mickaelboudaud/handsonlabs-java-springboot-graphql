package fr.maif.handsonlabs.javaspringbootgraphql.services.repositories;

import fr.maif.handsonlabs.javaspringbootgraphql.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

    List<Country> findByContinentId(String id);
}
