package com.example.tp;

public class MainEx4 {

    public static void main(String[] args) {

        
        Auteur auteur1 = new Auteur("Victor Hugo");
        Auteur auteur2 = new Auteur("George Orwell");

    
        Livre livre1 = new Livre("Les Misérables", auteur1);
        Livre livre2 = new Livre("Notre-Dame de Paris", auteur1);
        Livre livre3 = new Livre("1984", auteur2);

        
        Bibliotheque bibliotheque1 = new Bibliotheque("Centrale");
        Bibliotheque bibliotheque2 = new Bibliotheque("Quartier");

        
        bibliotheque1.ajouterLivre(livre1);
        bibliotheque1.ajouterLivre(livre3);

        bibliotheque2.ajouterLivre(livre1);
        bibliotheque2.ajouterLivre(livre2);


        System.out.println(auteur1);

        for (Livre livre : auteur1.getLivres()) {
            System.out.println("  => " + livre);
        }

        System.out.println(auteur2);

        for (Livre livre : auteur2.getLivres()) {
            System.out.println(" =>" + livre);
        }

        
        System.out.println(bibliotheque1);

        for (Livre livre : bibliotheque1.getCollection()) {
            System.out.println(
                    "  -> " + livre.getTitre() +
                    " (id=" + livre.getId() + ")"
            );
        }

        System.out.println(bibliotheque2);

        for (Livre livre : bibliotheque2.getCollection()) {
            System.out.println(
                    "  -> " + livre.getTitre() +
                    " (id=" + livre.getId() + ")"
            );
        }
    }
}