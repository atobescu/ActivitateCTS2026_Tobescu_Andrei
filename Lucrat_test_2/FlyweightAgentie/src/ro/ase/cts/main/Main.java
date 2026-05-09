package ro.ase.cts.main;

import ro.ase.cts.clase.FactoryPachete;
import ro.ase.cts.clase.PachetComun;
import ro.ase.cts.clase.PachetInPlus;

public class Main {
    public static void main(String[] args) {
        FactoryPachete factoryPachete = new FactoryPachete();

        PachetInPlus pachetInPlus1 = new PachetInPlus(Boolean.TRUE, 5);
        PachetInPlus pachetInPlus2 = new PachetInPlus(Boolean.FALSE, 0);
        PachetInPlus pachetInPlus3 = new PachetInPlus(Boolean.TRUE, 10);

        PachetComun pachetComun1 = (PachetComun) factoryPachete.getPachetTuristic(1);
        pachetComun1.descriesePachet(pachetInPlus1);
    }
}