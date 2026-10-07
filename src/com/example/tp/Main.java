package com.example.tp;

public class Main {

    public static void main(String[] args) {

        
        Filiere informatique = new Filiere("Developpement Informatique");
        Filiere reseaux = new Filiere("Reseaux et Systemes");

        
        Etudiant etudiant1 = new Etudiant("Bouhali", "Imane");
        Etudiant etudiant2 = new Etudiant("Berrada", "saad");
        Etudiant etudiant3 = new Etudiant("boualila", "hafsa");
        Etudiant etudiant4 = new Etudiant("Naciri", "Houssam");
        Etudiant etudiant5 = new Etudiant("Fassi", "Aya");
        Etudiant etudiant6 = new Etudiant("Kabbaj", "khadija");

        
        informatique.ajouterEtudiant(etudiant1);
        informatique.ajouterEtudiant(etudiant2);
        informatique.ajouterEtudiant(etudiant3);
        informatique.ajouterEtudiant(etudiant4);
        informatique.ajouterEtudiant(etudiant5);

        
        informatique.ajouterEtudiant(etudiant6);

        
        Etudiant etudiant7 = new Etudiant("Tahiri", "Sara");
        Etudiant etudiant8 = new Etudiant("Boudane", "Hamza");

        reseaux.ajouterEtudiant(etudiant7);
        reseaux.ajouterEtudiant(etudiant8);

       
        System.out.println(informatique);
        informatique.afficherEtudiants();

        System.out.println();

        
        System.out.println(reseaux);
        reseaux.afficherEtudiants();

        System.out.println();

        
        System.out.println("Informations sur l'étudiant : " + etudiant3);
    }
}