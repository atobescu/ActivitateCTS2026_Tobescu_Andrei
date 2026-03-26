package cts.ase.simple_factory.agentie;

public class FactoryPachete {

    public PachetTuristic createPachet(TipPachetTuristic tipPachetTuristic) throws Exception {
        switch (tipPachetTuristic){
            case pachetCazare -> {
                return new PachetCazare();
            }
            case pachetTransport -> {
                return new PachetTransport();
            }
            case pachetCazareSiTransport -> {
                return new PachetTransportSiCazare();
            }
            default -> {
                throw new Exception("Nu exista acest tip de pachet");
            }
        }
    }

}
