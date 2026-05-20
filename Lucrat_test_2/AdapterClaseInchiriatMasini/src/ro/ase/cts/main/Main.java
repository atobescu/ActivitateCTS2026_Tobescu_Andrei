package ro.ase.cts.main;

import ro.ase.cts.adapter.PachetInchiriereMasina;
import ro.ase.cts.inchiriere_masina.MasinaInchiriata;
import ro.ase.cts.pachete_existente.PachetCazare;

public class Main {
    public static void main(String[] args) {
        //lucru fara adapter:
        PachetCazare pachetCazare = new PachetCazare(1000.5);
        pachetCazare.getPret();

        MasinaInchiriata masinaInchiriata = new MasinaInchiriata("BMW", 500.0);
        System.out.println(masinaInchiriata.getPretInchiriere());

        //lucru cu adapter:
        PachetInchiriereMasina pachetInchiriereMasina = new PachetInchiriereMasina(masinaInchiriata);
        pachetInchiriereMasina.getPret();
    }
}