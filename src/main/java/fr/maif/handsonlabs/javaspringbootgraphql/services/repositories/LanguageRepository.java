package fr.maif.handsonlabs.javaspringbootgraphql.services.repositories;

import fr.maif.handsonlabs.javaspringbootgraphql.models.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRepository extends JpaRepository<Language, String> {
}
