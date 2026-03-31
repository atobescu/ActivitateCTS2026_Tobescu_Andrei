package ase.cts.main;

import ase.cts.builder.Pacient;
import ase.cts.builder.PacientBuilder;
import ase.cts.factory_method.factory.PersonalMedicalFactory;
import ase.cts.factory_method.factory.PersonalNonMedicalFactory;
import ase.cts.factory_method.factory.TipPersonalNonMedical;
import ase.cts.simple_factory.clase.PersonalSpital;
import ase.cts.simple_factory.factory.PersonalSpitalFactory;
import ase.cts.simple_factory.factory.TipPersonalMedical;

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
        PersonalSpital medic1 = personalSpitalFactory.creeaza(TipPersonalMedical.Medic);
        medic1.descriere();

        //ex3:
        PersonalMedicalFactory personalMedicalFactory = new PersonalMedicalFactory();
        PersonalSpital asistent1 = personalMedicalFactory.construieste(TipPersonalMedical.Asistent);
        asistent1.descriere();
        PersonalSpital secretar1 = new PersonalNonMedicalFactory().construieste(TipPersonalNonMedical.Secretar);
        secretar1.descriere();
    }
}