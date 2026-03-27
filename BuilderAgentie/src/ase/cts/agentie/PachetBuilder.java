package ase.cts.agentie;

public class PachetBuilder implements IBuilder{

    private Pachet pachet;

    @Override
    public Pachet build() {
        return pachet;
    }

    public PachetBuilder() {
        pachet = new Pachet(Boolean.FALSE, Boolean.FALSE, Boolean.FALSE);
    }

    //faci setterii pachetului, care returneaza this:

    public PachetBuilder setAreWiFi(Boolean areWiFi){
        this.pachet.setAreWiFi(areWiFi);
        return this;
    }

    public PachetBuilder setArePet(Boolean arePet){
        this.pachet.setArePet(arePet);
        return this;
    }

    public PachetBuilder setAreAC(Boolean areAC){
        this.pachet.setAreAC(areAC);
        return this;
    }
}
