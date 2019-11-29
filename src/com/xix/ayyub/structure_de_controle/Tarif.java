package com.xix.ayyub.structure_de_controle;

import java.util.Scanner;

public class Tarif {
    public static void main(String[] args)
    {


        String[] tarif = {"Vert", "Orange", "Rouge", "Pas assuré"};

        int age, nbrAccidents;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir votre âge: ");
        age = scanner.nextInt();
        System.out.println("Veuillez saisir le nombre d'accident: ");
        nbrAccidents = scanner.nextInt();
        if (age < 25 && nbrAccidents == 0)
        {
            System.out.println(tarif[1]);
        }
        else if (age >= 25 && nbrAccidents == 0)
        {
            System.out.println(tarif[0]);
        }
        else if (age < 25 && nbrAccidents <= 2)
        {
            System.out.println(tarif[2]);
        }
        else if (age >= 25 && nbrAccidents <= 2)
        {
            System.out.println(tarif[1]);
        }
        else if (age >= 25 && nbrAccidents <= 6)
        {
            System.out.println(tarif[2]);
        }
        else
        {
            System.out.println(tarif[3]);
        }

    }
}
