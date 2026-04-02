package ase.cts.main;

import ase.cts.singleton.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Comanda comanda1 = new Comanda();
        comanda1 = comanda1.adaugaLaComanda(new Supa(5,100));
        comanda1 = comanda1.adaugaLaComanda(new Cheesecake(2,0));
        System.out.println("Comanda 1 este: " + comanda1.getListaPreparate().toString());


        Comanda comanda2 = new Comanda();
        comanda2 = comanda2.adaugaLaComanda(new Supa(3,100));
        comanda2 = comanda2.adaugaLaComanda(new Cheesecake(1,0));
        System.out.println("Comanda 2 este: " + comanda2.getListaPreparate().toString());

//        partea 1:
//        List<Preparat> listaComenzi = comanda1.getListaPreparate();
//        listaComenzi.addAll(comanda2.getListaPreparate());
//        Cuptor cuptor = Cuptor.getInstanta(listaComenzi,1);
//        System.out.println(cuptor.toString());
//        listaComenzi.add(new Cheesecake(1,0));
//        System.out.println(cuptor.toString());

//        partea 2:


    }
}