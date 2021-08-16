package com.john.spawn.hellteam.hellmath;

import com.john.spawn.hellteam.hellmath.programme.CalculMental;
import com.john.spawn.hellteam.hellmath.programme.NombreAleatoire;

import java.util.Scanner;

/**
 * Classe de lancement du programme
 */
public class Main {

    /**
     * fonction de lancement du programme
     */
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        chooseProgramme();

        var play = true;

        while (play) {

            String choix = scanner.nextLine();

            switch (choix.trim()) {
                case "1":
                    System.out.println("Nombre aléatoire");
                    new NombreAleatoire(scanner);
                    play = false;
                    break;

                case "2":
                    System.out.println("Calcul mental");
                    new CalculMental(scanner);
                    play = false;
                    break;

                default:
                    System.out.println("Ce choix ne figure pas dans la liste");
                    chooseProgramme();
                    break;
            }
        }


    }

    /**
     * Choix du programme en question
     */
    public static void chooseProgramme() {
        System.out.println(
                "Veuillez choisir le programme de mathématiques : \n" +
                        "\t - 1. Nombre aléatoire \n" +
                        "\t - 2. Calcul mental"
        );
    }

}
