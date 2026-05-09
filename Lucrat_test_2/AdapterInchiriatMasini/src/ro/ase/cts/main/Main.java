package ro.ase.cts.main;

import ro.ase.cts.adapter.PachetComplet;
import ro.ase.cts.inchiriere_masini.PachetMasina;
import ro.ase.cts.pachet_turistic.PachetVacanta;

public class Main {
    public static void main(String[] args) {

        PachetMasina pachetMasina = new PachetMasina();
        pachetMasina.descriereMasina();

        PachetVacanta pachetVacanta = new PachetVacanta();
        pachetVacanta.descriere();

        //nu pot sa fac:
        //pachetMasina.descriere();
        //pachetMasina.pret(200.);

        PachetComplet pachetComplet = new PachetComplet(pachetMasina);
        pachetComplet.descriere();
        pachetComplet.pret(200.);

    }
}