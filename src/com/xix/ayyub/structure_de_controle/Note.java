package com.xix.ayyub.structure_de_controle;

public class Note {
    public static void main(String[] args) {
        /*Algorithme Lire-note-afficher-commentaire-associé
        variable: note: entier;

        lire(note);
        si(note <= 8)
        {
            ecrire("insuffisant");
        }
        sinon si(note <= 12)
        {
            ecrire("moyen");
        }
        sinon si(note <= 16)
        {
            ecrire("bien");
        }
        sinon
        {
            ecrire("très bien !");
        }
        Fin
        */
        System.out.println(NoteBulletin(17));

    }

    private static int NoteBulletin(int note) {
        if (note <= 8) {
            System.out.println("Insuffisant");
        } else if (note <= 12) {
            System.out.println("Moyen");
        } else if (note <= 16) {
            System.out.println("Bien");
        } else {
            System.out.println("Très bien !");
        }
        return note;
    }
}
