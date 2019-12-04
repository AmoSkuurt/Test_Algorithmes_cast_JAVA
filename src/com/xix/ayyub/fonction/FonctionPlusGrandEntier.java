package com.xix.ayyub.fonction;

import java.util.Scanner;

public class FonctionPlusGrandEntier {
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
        System.out.println(Max(75));
    }
    private static int Max(int valeur)
    {
        int compteur, max;
        max = valeur;
        compteur = 1;
        while (compteur < 5)
        {
            if (max < valeur)
                max = valeur;
            compteur++;
        }
        return(max);
    }
}
