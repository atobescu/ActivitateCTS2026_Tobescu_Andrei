package ase.cts.main;

import ase.cts.clase.Medic;
import ase.cts.clase.Pacient;
import ase.cts.clase.Salon;
import ase.cts.facade.FacadeInternare;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Marcel", 9);
        Medic medic = new Medic();
        Salon salon = new Salon();

        //inlocuim asta cu un facade:
        if(pacient.getGravitate()>6){
            if(medic.aInregistratPacientul(pacient)){
                int numarPat = salon.returneazaPatLiber();
                if(numarPat != -1){
                    System.out.println("Pacientul " + pacient.getNume() + " este internat in patul " + numarPat);
                    salon.ocupaPat(numarPat);
                }
            }
        }

        //cu facade:
        Pacient pacient2 = new Pacient("Mirel", 5);
        Pacient pacient3 = new Pacient("Popescu", 10);
        Pacient pacient4 = new Pacient("Ionescu", 8);
        Pacient pacient5 = new Pacient("Mihai", 5);
        Pacient pacient6 = new Pacient("Mihai", 10);
        Pacient pacient7 = new Pacient("Mihai", 10);

        FacadeInternare spital = new FacadeInternare(medic, salon);
        spital.interneazaPacient(pacient2);
        spital.interneazaPacient(pacient3);
        spital.interneazaPacient(pacient4);
        spital.interneazaPacient(pacient5);
        spital.interneazaPacient(pacient6);
        spital.interneazaPacient(pacient7);
    }
}