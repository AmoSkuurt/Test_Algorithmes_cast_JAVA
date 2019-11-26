package com.xix.ayyub;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Convertir FRANCS F en EUROS €
            Algortihme conversion-francs-euros
            variables: francs, euros: réel;

            Debut
                lire(francs);
                euros <-- francs / 6.56;
                ecrire(euros);
            Fin
        */
        float francs, euros;

        Scanner fr = new Scanner(System.in);
        System.out.println("Veuillez saisir un montant en Francs :");
        francs = fr.nextFloat();
        euros = (float) (francs / 6.56);
        System.out.println("La conversion de " + francs + " F est: " + euros + " €");
    }
}
