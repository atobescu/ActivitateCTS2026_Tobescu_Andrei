package ase.cts.main;

import ase.cts.builder.Pacient;
import ase.cts.builder.PacientBuilder;
import ase.cts.simple_factory.clase.PersonalSpital;
import ase.cts.simple_factory.factory.PersonalSpitalFactory;
import ase.cts.simple_factory.factory.TipPersonalSpital;

public class Main {
    public static void main(String[] args) throws Exception {
        //ex 1:
        PacientBuilder builder = new PacientBuilder();
        Pacient pacient1 = builder.setArePat(Boolean.TRUE).construieste();
        System.out.println(pacient1.toString());
        Pacient pacient2 = builder.construieste();
        System.out.println(pacient2.toString());

        //ex 2:
        PersonalSpitalFactory personalSpitalFactory = new PersonalSpitalFactory();
        PersonalSpital medic1 = personalSpitalFactory.creeaza(TipPersonalSpital.Medic);
        medic1.descriere();
    }
}