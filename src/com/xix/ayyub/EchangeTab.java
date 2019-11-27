package com.xix.ayyub;

import java.util.Scanner;

public class EchangeTab {
    public static void main(String[] args){
        /*Définir un tableau de 10 réels et échanger le premier et le dernier élément
        Algorithme echanger-premier-element-tableau-dernier-element
        variables: tab10R: tableau[] de réels;
                   temporaire: entier;

        Debut
            tab10R = new réel[10];
            lire(tab10R[0]);
            lire(tab10R[9]);
            temporaire <-- tab10R[0];
            tab10R[0] <-- tab10R[9];
            tab10R[9] <-- temporaire;
        Fin
        */
        int [] tab10R = new int[10];
        int temporaire;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre pour l'indice 0");
        tab10R[0] = scanner.nextInt();
        System.out.println("Veuillez saisir un nombre pour l'indice 9");
        tab10R[9] = scanner.nextInt();
        temporaire = tab10R[0];
        tab10R[0] = tab10R[9];
        tab10R[9] = temporaire;
        System.out.println("L'indice [0] vaut maintenant " + tab10R[0] + " et l'indice [9] vaut maintenant " + tab10R[9] + ". Les deux indices ont bien été changé !");
    }
}
