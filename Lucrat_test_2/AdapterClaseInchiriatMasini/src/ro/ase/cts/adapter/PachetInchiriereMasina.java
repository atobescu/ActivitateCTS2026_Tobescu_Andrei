package ro.ase.cts.adapter;

import ro.ase.cts.inchiriere_masina.MasinaInchiriata;
import ro.ase.cts.pachete_existente.IPachet;

public class PachetInchiriereMasina extends MasinaInchiriata implements IPachet {
    public PachetInchiriereMasina(String marca, Double pretInchiriere) {
        super(marca, pretInchiriere);
    }

    public PachetInchiriereMasina(MasinaInchiriata masinaInchiriata) {
        super(masinaInchiriata.getMarca(), masinaInchiriata.getPretInchiriere());
    }

    @Override
    public void descriere() {
        System.out.println("Pachetul contine o masina");
    }

    @Override
    public void getPret() {
        System.out.println("Pretul pachetului cu masina este de " + super.getPretInchiriere());
    }
}
