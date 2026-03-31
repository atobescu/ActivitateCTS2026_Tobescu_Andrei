package ase.cts.main;

import ase.cts.builder.Pacient;
import ase.cts.builder.PacientBuilder;

public class Main {
    public static void main(String[] args) {
        //ex 1:
        PacientBuilder builder = new PacientBuilder();
        Pacient pacient1 = builder.setArePat(Boolean.TRUE).construieste();
        System.out.println(pacient1.toString());
        Pacient pacient2 = builder.construieste();
        System.out.println(pacient2.toString());
    }
}