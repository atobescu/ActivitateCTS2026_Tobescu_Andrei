package cts.ase.simple_factory.main;

import cts.ase.simple_factory.agentie.FactoryPachete;
import cts.ase.simple_factory.agentie.PachetCazare;
import cts.ase.simple_factory.agentie.PachetTuristic;
import cts.ase.simple_factory.agentie.TipPachetTuristic;

public class Main {
    public static void main(String[] args) throws Exception {
        FactoryPachete factoryPachete = new FactoryPachete();
        PachetTuristic pachet1 = factoryPachete.createPachet(TipPachetTuristic.pachetCazare);
        pachet1.descriere();
    }
}