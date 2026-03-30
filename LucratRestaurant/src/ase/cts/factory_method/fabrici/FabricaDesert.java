package ase.cts.factory_method.fabrici;

import ase.cts.factory_method.clase.CheeseCake;
import ase.cts.factory_method.clase.Clatite;
import ase.cts.factory_method.clase.IFelMancare;

public class FabricaDesert implements IFabricaFeluriMancare{
    @Override
    public IFelMancare creeazaFelMancare(ITipFelMancare felMancare) throws Exception {
        switch (felMancare){
            case TipuriDesert.CheeseCake:{
                return new CheeseCake();
            }
            case TipuriDesert.Clatite:{
                return new Clatite();
            }
            default:
                throw new Exception("Nu exista acest tip de desert");
        }
    }
}
