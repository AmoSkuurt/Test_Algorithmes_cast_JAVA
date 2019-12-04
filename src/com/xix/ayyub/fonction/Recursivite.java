package com.xix.ayyub.fonction;

public class Recursivite {
    public static void main(String[] args)
    {
        System.out.println(factorielle(4));
    }
    private static int factorielle(int nb)
    {
        int f;

        if (nb == 1)
        {
            f = 1;
            return(f);
        }
        else
        {
           f = nb * factorielle (nb - 1);
           return(f);
        }
    }
}
