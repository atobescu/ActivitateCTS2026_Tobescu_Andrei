package ro.ase.cts.main;

import ro.ase.cts.clase.PachetTransport;
import ro.ase.cts.clase.ProxyPachetTransport;

public class Main {
    public static void main(String[] args) {
        PachetTransport pachetTransport = new PachetTransport(100., 60);
        pachetTransport.rezerva();//asa merge

        ProxyPachetTransport pachetTransportActualizat = new ProxyPachetTransport(pachetTransport);
        pachetTransportActualizat.rezerva();
    }
}