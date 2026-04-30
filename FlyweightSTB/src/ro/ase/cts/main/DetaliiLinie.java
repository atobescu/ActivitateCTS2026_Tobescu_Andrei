package ro.ase.cts.main;

public class DetaliiLinie {
    private String nrLinie;
    private String primaStatie;
    private String ultimaStatie;

    public String getNrLinie() {
        return nrLinie;
    }

    public void setNrLinie(String nrLinie) {
        this.nrLinie = nrLinie;
    }

    public String getPrimaStatie() {
        return primaStatie;
    }

    public void setPrimaStatie(String primaStatie) {
        this.primaStatie = primaStatie;
    }

    public String getUltimaStatie() {
        return ultimaStatie;
    }

    public void setUltimaStatie(String ultimaStatie) {
        this.ultimaStatie = ultimaStatie;
    }

    public DetaliiLinie(String nrLinie, String primaStatie, String ultimaStatie) {
        this.nrLinie = nrLinie;
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
    }
}
