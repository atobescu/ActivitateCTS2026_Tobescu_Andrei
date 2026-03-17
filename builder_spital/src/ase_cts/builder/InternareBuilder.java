package ase_cts.builder;

public class InternareBuilder implements InternareBuilderAbstract{
    private Internare internare;
    public InternareBuilder(String numePacient){
        this.internare = new Internare(Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, numePacient);
    }

    public InternareBuilder setPatRabatabil(Boolean arePatRabatabil){
        internare.patRabatabil = Boolean.TRUE;
        return this;
    }
    public InternareBuilder setMicDejun(Boolean areMicDejun){
        internare.micDejun = Boolean.TRUE;
        return this;
    }
    public InternareBuilder setPapuciDeCamera(Boolean arePapuciDeCamera){
        internare.papuciDeCamera = Boolean.TRUE;
        return this;
    }
    public InternareBuilder setHalatDeInterior(Boolean areHalatDeInterior){
        internare.halatInterior = Boolean.TRUE;
        return this;
    }
    public InternareBuilder setNumePacient(String numePacient){
        internare.numePacient = numePacient;
        return this;
    }

    @Override
    public Internare build() {
        return internare;
    }
}
