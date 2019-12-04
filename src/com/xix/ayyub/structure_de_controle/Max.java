package com.xix.ayyub.structure_de_controle;

import java.util.Scanner;

public class Max
{
    public static void main(String[] args)
    {
        /*
        Algorithme Max-de-deux-entiers
        variables: x, y: entier;
o
        Debut
            lire(x);
            lire(y)
            si(x > y) alors
            {
                ecrire("le maximum est: " + x);
            }
            sinon
            {
                ecrire("le maximum est: " + y);
            }
        Fin
        */
        int x, y;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir x: ");
        x = scanner.nextInt();
        System.out.println("Veuillez saisir y: ");
        y = scanner.nextInt();
        if (x > y)
        {
            System.out.println("le maximum est: " + x);
        }
        else
        {
            System.out.println("le maximum est: " + y);
        }

    }
}
