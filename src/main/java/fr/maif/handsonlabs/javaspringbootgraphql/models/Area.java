package fr.maif.handsonlabs.javaspringbootgraphql.models;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Country Area.
 *
 * https://fr.wikipedia.org/wiki/Liste_des_pays_et_territoires_par_superficie#/media/Fichier:Countries_by_area.svg
 * https://fr.vikidia.org/wiki/Liste_des_pays_par_superficie
 */
public enum Area {
    F0_T10000,
    F10000_T50000,
    F50000_T100000,
    F100000_T500000,
    F500000_T1000000,
    F1000000_T5000000,
    F5000000;
}
