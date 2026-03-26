package ase.cts.agentie;

public class FactoryPachetCazare implements FactoryPachete{
    @Override
    public PachetTuristic createPachet() {
            return new PachetCazare();
    }
}
