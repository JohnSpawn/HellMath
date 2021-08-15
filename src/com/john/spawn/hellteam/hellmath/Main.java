package com.john.spawn.hellteam.hellmath;

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
        System.out.println(
                "Veuillez choisir le programme de mathématiques : \n" +
                        "\t - 1. Nombre aléatoire"
        );

        var play = true;

        while (play) {

            String choix = scanner.nextLine();

            switch (choix.trim()) {
                case "1":
                    System.out.println("Nombre aléatoire");
                    new NombreAleatoire(scanner);
                    play = false;
                    break;

                default:
                    System.out.println("Ce choix ne figure pas dans la liste");
                    System.out.println(
                            "Veuillez choisir le programme de mathématiques : \n" +
                                    "\t - 1. Nombre aléatoire"
                    );
                    break;
            }
        }


    }

}
