package com.xix.ayyub;

public class TableauDeChaine {
    public static void main(String[] args){
        /*
        Algorithme tableau-3-elements-pointent-sur-la-meme-instance-chaine-"enfant"
        variables: tab: tableau[] de chaine;

        Debut
        tab = new Chaine[6];
        tab[0] = new chaine("enfant");
        tab[1] <-- tab[0];
        tab[2] <-- tab[1]
        Fin
        */
        String[] tab = new String[6];
        tab[0] = "enfant";
        tab[1] = tab[0];
        tab[2] = tab[0];
        System.out.println(tab[0] + " - " + tab[1] + " - " + tab[2]);
    }
}
