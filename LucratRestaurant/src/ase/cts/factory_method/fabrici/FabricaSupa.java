package ase.cts.factory_method.fabrici;


import ase.cts.factory_method.clase.*;

public class FabricaSupa implements IFabricaFeluriMancare{

    @Override
    public IFelMancare creeazaFelMancare(ITipFelMancare felMancare) throws Exception {
        switch (felMancare){
            case TipuriDeSupa.SupaLegume:{
                return new SupaLegume();
            }
            case TipuriDeSupa.SupaVita:{
                return new SupaVita();
            }
            case TipuriDeSupa.SupaCiuperci:{
                return new SupaCiuperci();
            }
            default:{
                throw new Exception("Nu exista acest tip de supa");
            }

        }
    }


}
