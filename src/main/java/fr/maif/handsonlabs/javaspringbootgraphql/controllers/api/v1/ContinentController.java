package fr.maif.handsonlabs.javaspringbootgraphql.controllers.api.v1;

import fr.maif.handsonlabs.javaspringbootgraphql.models.Continent;
import fr.maif.handsonlabs.javaspringbootgraphql.services.ContinentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/continents")
public class ContinentController {

    private ContinentService continentService;

    public ContinentController(ContinentService continentService) {
        this.continentService = continentService;
    }

    @GetMapping()
    public Iterable<Continent> findAll() {
        return continentService.findAll();
    }
}
