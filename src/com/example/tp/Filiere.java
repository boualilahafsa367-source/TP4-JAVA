package com.example.tp;

public class Filiere {
    private static int compteur = 0;
    private final int id;

    private String nom;
    private Etudiant[] etudiants;
    private int nombreEtudiants;

    public Filiere(String nom) {
        this.id = ++compteur;
        this.nom = nom;

        
        this.etudiants = new Etudiant[5];
        this.nombreEtudiants = 0;
    }
    public int getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }
    public int getNbEtudiants() {
        return nombreEtudiants;
    }

    public void ajouterEtudiant(Etudiant etudiant) {

        if (nombreEtudiants == etudiants.length) {

            Etudiant[] nouveauTableau = new Etudiant[etudiants.length * 2];
            System.arraycopy(etudiants, 0, nouveauTableau, 0, etudiants.length);                 
            etudiants = nouveauTableau;
        }

        etudiants[nombreEtudiants] = etudiant;
        nombreEtudiants++;
        etudiant.setFiliere(this);
    }
    public void afficherEtudiants() {

        System.out.println(
                "Filiere " + nom +
                " (id=" + id + ") : " +
                nombreEtudiants + " etudiant(s)"
        );

        for (int i = 0; i < nombreEtudiants; i++) {

            Etudiant etudiant = etudiants[i];

            System.out.println(
                    "  - " +
                    etudiant.getNom() + " " +
                    etudiant.getPrenom() +
                    " [id=" + etudiant.getId() + "]"
            );
        }
    }

    @Override
    public String toString() {

        return "Filiere[" +
                "id=" + id +
                ", nom=" + nom +
                ", nbEtudiants=" + nombreEtudiants +
                "]";
    }


}
