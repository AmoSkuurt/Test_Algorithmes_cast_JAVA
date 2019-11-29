package com.xix.ayyub.structure_de_controle;

import java.util.Scanner;

public class ComparateurOperateur {
    public static void main(String[] args)
    {
        /*Algorithme Comparer-operateur
        variable: telecom1,telecom2: tableau de réel;
                  facture1, facture2, consommation: réels;
        Debut
        telecom1 <- new entier[2];
        telecom2 <- new entier[2];
        telecom1[0] <- 10;
        telecom1[1] <- 0.5;
        telecom2[0] <- 15;
        telecom2[1] <- 0.42;
        lire(consommation);
        facture1 <- t1[0] + (t1[1] * consommation);
        facture2 <- t2[0] + (t2[1] * consommation);
        Si (facture1 < facture2)
            ecrire("L'opérateur le plus intéressant est Telecom 1");
        Sinon
            ecrire("L'opérateur le plus intéressant est Telecom 2");
        Fin
        */

        double facture1, facture2, consommation;
        double[] telecom1 = {10, 0.5};
        double[] telecom2 = {15, 0.42};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir votre consommation moyenne mensuelle: ");
        consommation = scanner.nextDouble();
        facture1 = telecom1[0] + (telecom1[1] * consommation);
        facture2 = telecom2[0] + (telecom2[1] * consommation);
        if (facture1 < facture2)
            System.out.println("L'opérateur le plus intéressant est Telecom 1");
        else
        {
            System.out.println("L'opérateur le plus intéressant est Telecom 2");
        }
    }
}
