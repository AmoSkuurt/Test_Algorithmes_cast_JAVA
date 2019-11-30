package com.xix.ayyub.structure_de_controle;

import java.util.Scanner;

public class PlusGrandEntier {
    public static void main(String[] args)
    {
        /*Algorithme Le-plus-grand-de-5-entiers
        variable: compteur, valeur, max: entier;

        lire(valeur);
        max <- valeur;
        compteur <- 1;
        tant que(compteur < 5) faire
        {
            lire(valeur);
            si(max < valeur)
                max <- valeur;
            compteur <- compteur +1;
        }
        ecrire("max egale ", max);
        Fin
        */

        int compteur, valeur, max;
        Scanner scanner = new Scanner(System.in);
        System.out.println("veuillez saisir une valeur: ");
        valeur = scanner.nextInt();
        max = valeur;
        compteur = 1;
        while (compteur < 5)
        {
            valeur = scanner.nextInt();
            if (max < valeur)
                max = valeur;
            compteur++;
        }
        System.out.println("max est égale: " + max);
    }
}
