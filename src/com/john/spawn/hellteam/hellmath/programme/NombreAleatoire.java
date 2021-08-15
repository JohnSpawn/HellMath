package com.john.spawn.hellteam.hellmath.programme;

import java.util.Random;
import java.util.Scanner;

/**
 * Le PC choisit un nombre, l'utilisateur doit le deviner
 */
public class NombreAleatoire {

    /**
     * Fonction principale
     *
     * @param scanner Lecteur des données de l'utilisateur
     */
    public NombreAleatoire(Scanner scanner) {

        System.out.println("Je vais choisir un nombre compris entre 0 & 100. \n" +
                "A vous de deviner lequel");

        int nombreATrouver = 1 + new Random().nextInt(100);

        System.out.println("Quel est le nombre que j'ai choisit ?");

        var nombreNonTrouve = true;

        while (nombreNonTrouve) {

            var nombrePropose = scanner.nextInt();

            if (nombreATrouver > nombrePropose) {
                System.out.println("Mon nombre est supérieur");
            } else if (nombreATrouver < nombrePropose) {
                System.out.println("Mon nombre est inferieur");
            } else {
                System.out.println("Vous avez trouvé, mon nombre était bien " + nombreATrouver);
                nombreNonTrouve = false;
            }


        }


    }

}
