package ase.cts.simple_factory.factory;

import ase.cts.simple_factory.clase.Asistent;
import ase.cts.simple_factory.clase.Brancardier;
import ase.cts.simple_factory.clase.Medic;
import ase.cts.simple_factory.clase.PersonalSpital;

public class PersonalSpitalFactory {
    public PersonalSpital creeaza(TipPersonalSpital tipPersonalSpital) throws Exception {
        switch (tipPersonalSpital){
            case Medic -> {
                return new Medic();
            }
            case Asistent -> {
                return new Asistent();
            }
            case Brancardier -> {
                return new Brancardier();
            }
            default -> throw new Exception("Nu exista tipul acesta de angajat");
        }
    }
}
