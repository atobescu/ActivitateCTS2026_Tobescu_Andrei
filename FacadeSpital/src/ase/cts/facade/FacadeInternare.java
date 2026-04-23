package ase.cts.facade;

import ase.cts.clase.Medic;
import ase.cts.clase.Pacient;
import ase.cts.clase.Salon;

public class FacadeInternare {
    private Medic medic;
    private Salon salon;

    public FacadeInternare(Medic medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }

    public void interneazaPacient(Pacient pacient){
        if(pacient.getGravitate()>6){
            if(medic.aInregistratPacientul(pacient)){
                int numarPat = salon.returneazaPatLiber();
                if(numarPat != -1){
                    System.out.println("Pacientul " + pacient.getNume() + " este internat in patul " + numarPat);
                    salon.ocupaPat(numarPat);
                }else {
                    System.out.println("Nu exista paturi libere");
                }
            }else {
                System.out.println("Trebuie trimitere de la medic");
            }
        }else {
            System.out.println("Du-te acasa, n-ai nimic");
        }
    }
}
