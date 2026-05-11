package ro.ase.cts.main;

import ro.ase.cts.clase.Operator;
import ro.ase.cts.clase.PachetCazare;
import ro.ase.cts.clase.PachetTransport;
import ro.ase.cts.command.ComandaRezervare;
import ro.ase.cts.command.ComandaVanzare;

public class Main {
    public static void main(String[] args) {
        Operator operator = new Operator();

        PachetCazare pachetCazare = new PachetCazare();
        PachetTransport pachetTransport = new PachetTransport();

        operator.invoca(new ComandaRezervare(pachetTransport));
        operator.invoca(new ComandaVanzare(pachetCazare));
        operator.arataIstoricComenzi();
        operator.undo();
        System.out.println("nou:");
        operator.arataIstoricComenzi();

    }
}