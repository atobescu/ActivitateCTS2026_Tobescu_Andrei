package ase.cts.agentie;

public class FactoryPachetTransport implements FactoryPachete{

    @Override
    public PachetTuristic createPachet() {
        return new PachetTransport();
    }
}
