package fr.maif.handsonlabs.javaspringbootgraphql.controllers.api.v1;

import fr.maif.handsonlabs.javaspringbootgraphql.models.Language;
import fr.maif.handsonlabs.javaspringbootgraphql.services.LanguageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/languages")
public class LanguageController {

    private LanguageService languageService;

    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping()
    public List<Language> findAll() {
        return languageService.findAll();
    }
}
