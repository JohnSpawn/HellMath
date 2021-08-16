package com.john.spawn.hellteam.hellmath.programme;

/**
 * Classe listant les différents opérateurs
 */
public enum OperateurEnum {

    ADDITION("+"),
    SOUSTRACTION("-"),
    MULTIPLICATION("*");

    String operateur;

    OperateurEnum(String operateur) {
        this.operateur = operateur;
    }

}
