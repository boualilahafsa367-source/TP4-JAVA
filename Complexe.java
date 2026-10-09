
package com.example.tp;

public class Complexe {

    private double reel;
    private double imaginaire;

    // Constructeur
    public Complexe(double reel, double imaginaire) {
        this.reel = reel;
        this.imaginaire = imaginaire;
    }

    // Addition de deux nombres complexes
    public Complexe plus(Complexe autre) {
        double nouveauReel = this.reel + autre.reel;
        double nouvellePartieImaginaire =
                this.imaginaire + autre.imaginaire;

        return new Complexe(nouveauReel, nouvellePartieImaginaire);
    }

    // Soustraction de deux nombres complexes
    public Complexe moins(Complexe autre) {
        double nouveauReel = this.reel - autre.reel;
        double nouvellePartieImaginaire =
                this.imaginaire - autre.imaginaire;

        return new Complexe(nouveauReel, nouvellePartieImaginaire);
    }

    // Représentation du nombre complexe sous forme de texte
    @Override
    public String toString() {
        if (imaginaire >= 0) {
            return reel + " +" + imaginaire + "i";
        } else {
            return reel + " " + imaginaire + "i";
        }
    }
}

