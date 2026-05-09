package ro.ase.cts.clase;

public class PachetInPlus {
    private Boolean areCina;
    private Integer nrExcursii;

    public PachetInPlus(Boolean areCina, Integer nrExcursii) {
        this.areCina = areCina;
        this.nrExcursii = nrExcursii;
    }

    public Boolean getAreCina() {
        return areCina;
    }

    public void setAreCina(Boolean areCina) {
        this.areCina = areCina;
    }

    public Integer getNrExcursii() {
        return nrExcursii;
    }

    public void setNrExcursii(Integer nrExcursii) {
        this.nrExcursii = nrExcursii;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PachetInPlus{");
        sb.append("areCina=").append(areCina);
        sb.append(", nrExcursii=").append(nrExcursii);
        sb.append('}');
        return sb.toString();
    }
}
