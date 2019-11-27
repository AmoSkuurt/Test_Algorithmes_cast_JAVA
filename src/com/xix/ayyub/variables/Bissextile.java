package com.xix.ayyub.variables;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Bissextile {
    /*Lire une Date et afficher si elle est bissextile
    Algorithme remplacer-dernier-car-par-s
    variables: d1: Date;
               j, m, a: entier;

    Debut
        lire(j, m, a);
        d1 <-- new Date(j, m, a);
        ecrire("La date est bissextile: " + d1.estBissextile());
    Fin

    https://docs.oracle.com/javase/7/docs/api/java/util/Date.html
    **Date();**
    Allocates a Date object and initializes it so that it represents the time at which it was allocated, measured to the nearest millisecond.
    **Date(int year, int month, int date);**
    ****Deprecated.****
    As of JDK version 1.1, replaced by Calendar.set(year + 1900, month, date) or GregorianCalendar(year + 1900, month, date).
    **Date(int year, int month, int date, int hrs, int min);**
    ****Deprecated.****
    As of JDK version 1.1, replaced by Calendar.set(year + 1900, month, date, hrs, min) or GregorianCalendar(year + 1900, month, date, hrs, min).
    **Date(int year, int month, int date, int hrs, int min, int sec);**
    ****Deprecated.****
    As of JDK version 1.1, replaced by Calendar.set(year + 1900, month, date, hrs, min, sec) or GregorianCalendar(year + 1900, month, date, hrs, min, sec).
    */
    public static void main(String[] args) {
        Date d1 = new Date();
    }
}
