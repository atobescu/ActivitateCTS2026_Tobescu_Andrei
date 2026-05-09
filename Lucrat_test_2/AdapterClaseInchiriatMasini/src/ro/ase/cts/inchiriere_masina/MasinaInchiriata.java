package ro.ase.cts.inchiriere_masina;

public class MasinaInchiriata {
    private String marca;
    private Double pretInchiriere;

    public MasinaInchiriata(String marca, Double pretInchiriere) {
        this.marca = marca;
        this.pretInchiriere = pretInchiriere;
    }

    public Double getPretInchiriere() {
        return pretInchiriere;
    }

    public void setPretInchiriere(Double pretInchiriere) {
        this.pretInchiriere = pretInchiriere;
    }

    public String getMarca() {
        return marca;
    }
}
