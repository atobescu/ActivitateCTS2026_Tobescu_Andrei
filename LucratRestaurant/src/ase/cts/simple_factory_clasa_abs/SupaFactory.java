package ase.cts.simple_factory_clasa_abs;

public class SupaFactory {
    public Supa creeazaSupa(TipuriDeSupa tipuriDeSupa) throws Exception {
        switch (tipuriDeSupa){
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
