package ase.cts.main;

import ase.cts.builder.Rezervare;
import ase.cts.builder.RezervareBuilder;
import ase.cts.simple_factory.ISupa;
import ase.cts.simple_factory.SupaFactory;
import ase.cts.simple_factory.SupaLegume;
import ase.cts.simple_factory.TipuriDeSupa;
import ase.cts.simple_factory_clasa_abs.Supa;

public class Main {
    public static void main(String[] args) throws Exception {
        //ex 1:
        SupaFactory supaFactory = new SupaFactory();
        ISupa supaLegume = supaFactory.creeazaSupa(TipuriDeSupa.SupaLegume);
        supaLegume.descriere();

        //ex 1 cu clasa abstracta:
        ase.cts.simple_factory_clasa_abs.SupaFactory supaFactory2= new ase.cts.simple_factory_clasa_abs.SupaFactory();
        Supa supaCiuperci = supaFactory2.creeazaSupa(ase.cts.simple_factory_clasa_abs.TipuriDeSupa.SupaCiuperci);
        supaCiuperci.descriere();

        //ex 2:
        RezervareBuilder builder = new RezervareBuilder();
        Rezervare rezervare1 = builder.build();
        builder.setmuzicaAmbientala(Boolean.TRUE);
        System.out.println(rezervare1.toString());
        Rezervare rezervare2 = builder.setGenMuzica("Jazz").build();
        System.out.println(rezervare2.toString());



    }
}