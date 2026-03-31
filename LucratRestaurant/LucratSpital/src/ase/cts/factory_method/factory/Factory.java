package ase.cts.factory_method.factory;

import ase.cts.simple_factory.clase.PersonalSpital;

public interface Factory {
    public PersonalSpital construieste(TipPersonalSpital tip) throws Exception;
}
