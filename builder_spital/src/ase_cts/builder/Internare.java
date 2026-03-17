package ase_cts.builder;

public class Internare {
    protected Boolean patRabatabil;
    protected Boolean micDejun;
    protected Boolean papuciDeCamera;
    protected Boolean halatInterior;
    protected String numePacient;



    public Internare(Boolean patRabatabil, Boolean micDejun, Boolean papuciDeCamera, Boolean halatInterior, String numePacient) {
        this.patRabatabil = patRabatabil;
        this.micDejun = micDejun;
        this.papuciDeCamera = papuciDeCamera;
        this.halatInterior = halatInterior;
        this.numePacient = numePacient;
    }

    public void setPatRabatabil(Boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
    }

    public void setMicDejun(Boolean micDejun) {
        this.micDejun = micDejun;
    }

    public void setPapuciDeCamera(Boolean papuciDeCamera) {
        this.papuciDeCamera = papuciDeCamera;
    }

    public void setHalatInterior(Boolean halatInterior) {
        this.halatInterior = halatInterior;
    }

    public void setNumePacient(String numePacient) {
        this.numePacient = numePacient;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InternareBuilder{");
        sb.append("patRabatabil=").append(patRabatabil);
        sb.append(", micDejun=").append(micDejun);
        sb.append(", papuciDeCamera=").append(papuciDeCamera);
        sb.append(", halatInterior=").append(halatInterior);
        sb.append(", numePacient='").append(numePacient).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
