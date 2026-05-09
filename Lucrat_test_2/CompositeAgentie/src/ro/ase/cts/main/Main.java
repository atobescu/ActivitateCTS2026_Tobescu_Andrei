package ro.ase.cts.main;

import ro.ase.cts.clase.Categorie;
import ro.ase.cts.clase.Element;
import ro.ase.cts.composite.SubCategorie;

public class Main {
    public static void main(String[] args) throws Exception {
        Element categorieMare = new Categorie("Meniu");
        Element categorie1 = new Categorie("Pachete");
        Element categorie2 = new Categorie("Galerie");
        Element categorie3 = new Categorie("Despre noi");

        Element subCategorie1 = new SubCategorie("pachete zboruri");
        Element subCategorie2 = new SubCategorie("pachete cazare");
        Element subCategorie3 = new SubCategorie("pachete tren");
        Element subCategorie4 = new SubCategorie("poze 2025");
        Element subCategorie5 = new SubCategorie("poze 2026");

        categorie1.adaugaNos(subCategorie1);
        categorie1.adaugaNos(subCategorie2);
        categorie1.adaugaNos(subCategorie3);

        categorie2.adaugaNos(subCategorie4);
        categorie2.adaugaNos(subCategorie5);

        categorieMare.adaugaNos(categorie1);
        categorieMare.adaugaNos(categorie2);
        categorieMare.adaugaNos(categorie3);

        categorieMare.descriere();
    }
}