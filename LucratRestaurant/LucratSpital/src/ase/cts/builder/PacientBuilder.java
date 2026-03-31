package ase.cts.builder;

public class PacientBuilder implements Builder{
    private Pacient pacient;
    @Override
    public Pacient construieste() {
        return pacient;
    }

    public PacientBuilder() {
        pacient = new Pacient(Boolean.FALSE, Boolean.FALSE);
    }

    public PacientBuilder setArePat(Boolean arePat){
        this.pacient.setArePat(arePat);
        return this;
    }
    public PacientBuilder setMicDejun(Boolean areMicDejun){
        this.pacient.setAreMicDejun(areMicDejun);
        return this;
    }
}
