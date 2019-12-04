package com.xix.ayyub.fonction;

import java.util.Scanner;

public class FonctionTarif {
    public static void main(String[] args)
    {
        System.out.println(FonctionTarifExo(25, 6));

    }
    private static String FonctionTarifExo(int age, int nbrAccidents)
    {
        String[] tarif = {"Vert", "Orange", "Rouge", "Pas assuré"};

        if (age < 25 && nbrAccidents == 0)
        {
            return(tarif[1]);
        }
        else if (age >= 25 && nbrAccidents == 0)
        {
            return(tarif[0]);
        }
        else if (age < 25 && nbrAccidents <= 2)
        {
            return(tarif[2]);
        }
        else if (age >= 25 && nbrAccidents <= 2)
        {
            return(tarif[1]);
        }
        else if (age >= 25 && nbrAccidents <= 6)
        {
            return(tarif[2]);
        }
        else
        {
            return(tarif[3]);
        }
    }
}
