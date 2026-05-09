package ro.ase.cts.adapter;

import ro.ase.cts.inchiriere_masini.PachetMasina;
import ro.ase.cts.pachet_turistic.Pachet;

public class PachetComplet implements Pachet {

    private PachetMasina pachetMasina;

    public PachetComplet(PachetMasina pachetMasina) {
        this.pachetMasina = pachetMasina;
    }

    @Override
    public void descriere() {
        pachetMasina.descriereMasina();
    }

    @Override
    public void pret(Double pret) {
        System.out.println("Pretul acestui pachet cu masina este de " + pret);
    }
}
