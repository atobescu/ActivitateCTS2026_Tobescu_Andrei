package ase.cts.agentie;

public class FactoryPachetTransportSiCazare implements FactoryPachete{
    @Override
    public PachetTuristic createPachet() {
        return new PachetTransportSiCazare();
    }
}
