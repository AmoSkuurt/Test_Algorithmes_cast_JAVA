package com.xix.ayyub.structure_de_controle;

import java.util.Scanner;

public class Tableau50Elements {
    public static void main(String[] args)
    {
        /*Algorithme saisie-de-nombres
        variable: compteur, nbr: entier;
                  tab: tableau[] d'entiers;

            tab <- new entier [50];
            compteur <- 0;
            lire(nbr);
            tant que (nbr < -1 OU nbr > 20) faire
            {
                lire(nbr);
            }
            tant que (nbr ≠ -1 ET compteur ≠ 50)
            {
                tab[compteur] <- nbr;
                compteur++
                lire(nbr)
                tant que (nbr < -1 OU nbr > 20) faire
                {
                lire(nbr);
                }
            }

        Fin
        */

        int nbr;
        int [] tab = new int[50];
        int compteur = 0;
        System.out.println("Saisissez un nombre: ");
        Scanner scanner = new Scanner(System.in);
        nbr = scanner.nextInt();
        while (nbr < -1 || nbr > 20)
        {
            System.out.println("Erreur. Réessayer!: ");
            nbr = scanner.nextInt();
        }
        while (nbr != -1 && compteur != 50)
        {
            tab[compteur] = nbr;
            compteur++;
            nbr = scanner.nextInt();
            while (nbr < -1 || nbr > 20)
            {
                System.out.println("Erreur. Réessayer!: ");
                nbr = scanner.nextInt();
            }
        }
    }
}
