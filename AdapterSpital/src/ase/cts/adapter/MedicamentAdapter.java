package ase.cts.adapter;

import ase.cts.farmacie.MedicamentFarmacie;
import ase.cts.magazin.MedicamentMagazin;

public class MedicamentAdapter extends MedicamentFarmacie {

    //avem nevoie de obiectul pe care il adaptam:
    private MedicamentMagazin medicamentMagazin;

    public MedicamentAdapter(MedicamentMagazin medicamentMagazin) {
        super(medicamentMagazin.getNumeMedicament());
        this.medicamentMagazin = medicamentMagazin;
    }

    @Override
    public void cumparaMedicament() {
        medicamentMagazin.achizitioneazaMedicament();
    }
}
