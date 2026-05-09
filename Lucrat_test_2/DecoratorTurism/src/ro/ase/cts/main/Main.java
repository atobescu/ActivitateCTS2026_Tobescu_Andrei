package ro.ase.cts.main;

import ro.ase.cts.clase_initiale.PachetTransport;
import ro.ase.cts.decorator.PachetAnulabil;
import ro.ase.cts.decorator.PachetTransportAnulabil;

public class Main {
    public static void main(String[] args) {
        PachetTransport pachetTransport = new PachetTransport();
        pachetTransport.descriere();

        PachetTransportAnulabil pachetTransportAnulabil = new PachetTransportAnulabil(pachetTransport);
        pachetTransportAnulabil.anulare();
    }
}