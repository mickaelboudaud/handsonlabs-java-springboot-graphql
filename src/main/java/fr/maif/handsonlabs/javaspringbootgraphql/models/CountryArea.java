package fr.maif.handsonlabs.javaspringbootgraphql.models;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Country Area.
 *
 * https://fr.wikipedia.org/wiki/Liste_des_pays_et_territoires_par_superficie#/media/Fichier:Countries_by_area.svg
 * https://fr.vikidia.org/wiki/Liste_des_pays_par_superficie
 */
public enum CountryArea {
    F0_T10000("De 0 à 10000 Km²"),
    F10000_T50000("De 10000 à 50000 Km²"),
    F50000_T100000("De 50000 à 100000 Km²"),
    F100000_T500000("De 100000 à 500000 Km²"),
    F500000_T1000000("De 500000 à 1000000 Km²"),
    F1000000_T5000000("De 1000000 à 5000000 Km²"),
    F5000000("Plus de 5000000 de Km²");

    private String label;

    CountryArea(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
