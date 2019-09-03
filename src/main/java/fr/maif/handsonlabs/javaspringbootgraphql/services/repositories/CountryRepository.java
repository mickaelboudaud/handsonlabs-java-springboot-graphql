package fr.maif.handsonlabs.javaspringbootgraphql.services.repositories;

import fr.maif.handsonlabs.javaspringbootgraphql.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {
}
