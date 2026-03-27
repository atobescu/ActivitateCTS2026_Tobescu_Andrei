package ase.cts.main;

import ase.cts.agentie.ListaOferte;
import ase.cts.agentie.TipPachetTuristic;

public class Main {
    public static void main(String[] args) {
        ListaOferte listaOferte = new ListaOferte("Oferta1", TipPachetTuristic.pachetCazare);
        System.out.println(listaOferte.toString());
        ListaOferte listaOferteClona = listaOferte.copiaza();
        System.out.println(listaOferteClona.toString());
    }
}