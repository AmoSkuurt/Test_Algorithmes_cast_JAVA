package com.xix.ayyub;

import java.util.Scanner;

public class Somme {
    public static void main(String[] args) {
        /* Décomposer une somme en billet de 10€ et en pièces de 2e et en pièces de 1€
           Algorithme decompose-somme-euros-10-2-1
           variables: somme, reste, nb10, nb2, nb1: entier;

           Debut
                lire(somme);
                nb10 <-- somme DIV 10;
                reste <-- somme MOD 10;
                nb2 <-- reste DIV 2;
                nb1 <-- reste MOD 2;
                ecrire ("La somme " + somme + " est égal à: " + nb10 + " billet(s) de 10€, " + nb2 + " pièce(s) de 2€, " + nb1 + " pièce(s) de 1€.");
        */
        int somme, reste, nb10, nb2, nb1;

        Scanner sm = new Scanner(System.in);
        System.out.println("Veuillez saisir une somme:");
        somme = sm.nextInt();
        nb10 = somme / 10;
        reste = somme % 10;
        nb2 = reste / 2;
        nb1 = reste % 2;
        if (nb10 >= 2 && nb2 >= 2) {
            System.out.println("La somme " + somme + " est égal à: " + nb10 + " billets de 10€, " + nb2 + " pièces de 2€, " + nb1 + " pièce de 1€.");
        }
        else if (nb10 >= 2) {
            System.out.println("La somme " + somme + " est égal à: " + nb10 + " billets de 10€, " + nb2 + " pièce de 2€, " + nb1 + " pièce de 1€.");
        }
        else if (nb2 >= 2) {
            System.out.println("La somme " + somme + " est égal à: " + nb10 + " billet de 10€, " + nb2 + " pièces de 2€, " + nb1 + " pièce de 1€.");
        }
        else {
            System.out.println("La somme " + somme + " est égal à: " + nb10 + " billet de 10€, " + nb2 + " pièce de 2€, " + nb1 + " pièce de 1€.");
        }
    }
}
