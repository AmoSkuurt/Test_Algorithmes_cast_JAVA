package com.xix.ayyub.variables;

import java.util.Scanner;

public class Caractere
{
    public static void main (String[] args)
    {
        /* Lire une chaine de caractère à un user, remplacer le dernier caractère par un 's' et l'afficher à l'écran
        Algorithme remplacer-dernier-car-par-s
        variables: str: Chaine;
                   pos: entier;

        Debut
            str = new Chaine();
            str.lire();
            pos <-- str.longueur();
            str.modifierIeme(pos -1, 's');
            str.ecrire();
        Fin
        */
        int pos;
        String carac;

        Scanner chaine = new Scanner(System.in);
        System.out.println("Veuillez saisir une chaîne de caractère:");
        carac = chaine.nextLine();
        pos = carac.length();
        StringBuilder builder = new StringBuilder(carac);
        builder.setCharAt(pos - 1, 's');
        carac= builder.toString();
        System.out.println("Voici votre nouvelle chaîne de caractère: " + carac);

    }
}
