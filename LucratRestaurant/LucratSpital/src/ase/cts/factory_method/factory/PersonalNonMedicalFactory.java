package ase.cts.factory_method.factory;

import ase.cts.factory_method.clase.Registrator;
import ase.cts.factory_method.clase.Secretar;
import ase.cts.simple_factory.clase.PersonalSpital;

public class PersonalNonMedicalFactory implements Factory{
    @Override
    public PersonalSpital construieste(TipPersonalSpital tip) throws Exception {
        switch (tip){
            case TipPersonalNonMedical.Registrator: {
                return new Registrator();
            }
            case TipPersonalNonMedical.Secretar:{
                return new Secretar();
            }
            default:{
                throw new Exception ("Nu exista acest personal non medical");
            }
        }
    }
}
