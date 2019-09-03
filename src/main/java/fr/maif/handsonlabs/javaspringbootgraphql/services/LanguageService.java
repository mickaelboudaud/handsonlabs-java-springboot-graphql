package fr.maif.handsonlabs.javaspringbootgraphql.services;

import fr.maif.handsonlabs.javaspringbootgraphql.models.Language;
import fr.maif.handsonlabs.javaspringbootgraphql.services.repositories.LanguageRepository;
import org.springframework.stereotype.Service;

@Service
public class LanguageService {

    private LanguageRepository languageRepository;

    public LanguageService(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    public Iterable<Language> findAll() {
        return languageRepository.findAll();
    }
}
