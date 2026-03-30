package ase.cts.factory_method.fabrici;

import ase.cts.factory_method.clase.IFelMancare;

public interface IFabricaFeluriMancare {
    public IFelMancare creeazaFelMancare(ITipFelMancare felMancare) throws Exception;
}
