package fr.maif.handsonlabs.javaspringbootgraphql.services.repositories;

import fr.maif.handsonlabs.javaspringbootgraphql.models.Continent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContinentRepository extends JpaRepository<Continent, String> {
}
