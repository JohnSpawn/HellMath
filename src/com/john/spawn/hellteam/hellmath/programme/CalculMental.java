package com.john.spawn.hellteam.hellmath.programme;

import java.util.Random;
import java.util.Scanner;

/**
 * Classe sur le calcul mental
 */
public class CalculMental {

    /**
     * Fonction principale
     *
     * @param scanner Lecture des données de l'utilisateur, et choix de l'opétation en question
     */
    public CalculMental(Scanner scanner) {

        chooseOperation();

        boolean choixOperationOk = false;

        while (!choixOperationOk) {

            String operation = scanner.next();
            switch (operation) {
                case "1":
                    choixOperationOk = true;
                    operation(scanner, OperateurEnum.ADDITION);
                    break;

                case "2":
                    choixOperationOk = true;
                    operation(scanner, OperateurEnum.SOUSTRACTION);
                    break;

                case "3":
                    choixOperationOk = true;
                    operation(scanner, OperateurEnum.MULTIPLICATION);
                    break;

                default:
                    System.out.println("Ce choix n'est pas dans la liste");
                    chooseOperation();
                    break;
            }
        }


    }

    /**
     * Quand l'operation est choisit, traitement de cette operation en fonction des données récupérées
     *
     * @param scanner       Lecteur des données de l'utilisateur
     * @param operateurEnum Operateur e l'opération
     */
    private void operation(Scanner scanner, OperateurEnum operateurEnum) {

        System.out.println("Combien voulez-vous d'opérations ?");

        int nombreOperations = scanner.nextInt();
        int nombreTests = 0;
        int nombreTestsOk = 0;

        System.out.println("Choisir le nombre d'unités pour chaque chiffre");

        int nombreChiffres = scanner.nextInt();

        while (nombreTests < nombreOperations) {

            double chiffreA = new Random().nextInt((int) (Math.pow(10, nombreChiffres) - 1));
            double chiffreB = new Random().nextInt((int) (Math.pow(10, nombreChiffres) - 1));

            if (chiffreA > chiffreB) {
                System.out.println("quel est le résultat de " + chiffreA + operateurEnum + chiffreB);
            } else {
                System.out.println("quel est le résultat de " + chiffreB + operateurEnum + chiffreA);
            }


            int resultat = scanner.nextInt();

            double somme = 0;

            switch (operateurEnum.operateur) {
                case "+":
                    somme = chiffreA + chiffreB;
                    break;

                case "-":
                    somme = chiffreA - chiffreB;
                    break;

                case "*":
                    somme = chiffreA * chiffreB;
                    break;

                default:
                    System.out.println("Erreur sur le choix de l'opérateur");
                    break;
            }

            if (resultat == somme) {
                System.out.println("Bravo, vous avez trouvé le résultat");
                nombreTestsOk++;
            } else {
                System.out.println("Erreur, la bonne réponse était " + somme);
            }

            nombreTests++;

        }

        System.out.println("résultat : " + nombreTestsOk + " / " + nombreTests);


    }

    /**
     * Choix de l'opération en question
     */
    public static void chooseOperation() {
        System.out.println("Quel type d'opération souhaitez-vous vous entrainer ? \n" +
                "\t 1. Addition \n" +
                "\t 2. Soustraction \n" +
                "\t 3. Multiplication");
    }
}
