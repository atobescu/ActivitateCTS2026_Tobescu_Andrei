package ase.cts.builder;

public class Pacient {
    private Boolean arePat;
    private Boolean areMicDejun;

    public Pacient(Boolean arePat, Boolean areMicDejun) {
        super();
        this.arePat = arePat;
        this.areMicDejun = areMicDejun;
    }

    public Pacient() {
    }

    public Boolean getArePat() {
        return arePat;
    }

    public void setArePat(Boolean arePat) {
        this.arePat = arePat;
    }

    public Boolean getAreMicDejun() {
        return areMicDejun;
    }

    public void setAreMicDejun(Boolean areMicDejun) {
        this.areMicDejun = areMicDejun;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("arePat=").append(arePat);
        sb.append(", areMicDejun=").append(areMicDejun);
        sb.append('}');
        return sb.toString();
    }
}
