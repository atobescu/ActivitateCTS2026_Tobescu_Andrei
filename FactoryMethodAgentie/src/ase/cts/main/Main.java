package ase.cts.main;

import ase.cts.agentie.FactoryPachetCazare;
import ase.cts.agentie.PachetCazare;
import ase.cts.agentie.PachetTuristic;

public class Main {
    public static void main(String[] args) {
        FactoryPachetCazare factoryPachetCazare = new FactoryPachetCazare();
        PachetTuristic pachetCazare = factoryPachetCazare.createPachet();
        pachetCazare.descriere();
    }
}