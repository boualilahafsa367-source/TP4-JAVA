package ma.projet.test;


import ma.projet.bean.Article;
import ma.projet.bean.Categorie;

public class TestApp {

    public static void main(String[] args) {

        
        Categorie catPortable =
                new Categorie("Ordinateur Portable", "O PR");

        Categorie catPoste =
                new Categorie("Ordinateur Poste", "O PO");

        
        Categorie[] listeCategories = {
                catPortable,
                catPoste
        };

    
        Article art1 =
                new Article(14, "DELL INSPIRON", catPortable);

        Article art2 =
                new Article(4, "SONY VAIO", catPortable);

        Article art3 =
                new Article(74, "TERRA", catPoste);

        Article art4 =
                new Article(785, "HP Compaq", catPoste);

        

        Article[] listeArticles = {
                art1,
                art2,
                art3,
                art4
        };

        
        for (Categorie cat : listeCategories) {

            System.out.println(cat.getLibelle() + " :");

            
            for (Article art : listeArticles) {

                if (art.getCategorie().getId() == cat.getId()) {
                    System.out.println("  - " + art);
                }
            }

            System.out.println();
        }
    }
}
