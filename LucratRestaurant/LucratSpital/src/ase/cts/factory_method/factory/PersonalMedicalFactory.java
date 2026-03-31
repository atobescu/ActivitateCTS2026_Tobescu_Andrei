package ase.cts.factory_method.factory;

import ase.cts.simple_factory.clase.Asistent;
import ase.cts.simple_factory.clase.Brancardier;
import ase.cts.simple_factory.clase.Medic;
import ase.cts.simple_factory.clase.PersonalSpital;
import ase.cts.simple_factory.factory.TipPersonalMedical;

public class PersonalMedicalFactory implements Factory{
    @Override
    public PersonalSpital construieste(TipPersonalSpital tip) throws Exception {
        switch (tip){
            case TipPersonalMedical.Medic -> {
                return new Medic();
            }
            case TipPersonalMedical.Asistent -> {
                return new Asistent();
            }
            case TipPersonalMedical.Brancardier -> {
                return new Brancardier();
            }
            default -> throw new Exception("Nu exista tipul acesta de personal medical");
        }
    }
}
