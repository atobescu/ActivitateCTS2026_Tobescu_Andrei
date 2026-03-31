package ase.cts.main;

import ase.cts.builder.Pacient;
import ase.cts.builder.PacientBuilder;
import ase.cts.factory_method.factory.PersonalMedicalFactory;
import ase.cts.factory_method.factory.PersonalNonMedicalFactory;
import ase.cts.factory_method.factory.TipPersonalNonMedical;
import ase.cts.prototype.PrototypeReteta;
import ase.cts.prototype.Reteta;
import ase.cts.simple_factory.clase.PersonalSpital;
import ase.cts.simple_factory.factory.PersonalSpitalFactory;
import ase.cts.simple_factory.factory.TipPersonalMedical;

import java.util.HashMap;
import java.util.Map;

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

        //ex4:
        Map<Double, String> proportii = new HashMap<>();
        proportii.put(10.1,"Lala");
        proportii.put(10.12,"Lala12");
        Reteta reteta1 = new Reteta(10.1,10.,5.,proportii);
        System.out.println(reteta1.toString());
        PrototypeReteta reteta2 = reteta1.cloneaza();
        System.out.println(reteta2.toString());
    }
}