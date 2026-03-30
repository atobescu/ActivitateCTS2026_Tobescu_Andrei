package ase.cts.builder;

public class Rezervare {
    public Boolean laGeam;
    public Boolean scauneErgonomice;
    public Boolean masaDecorata;
    public Boolean muzicaAmbientala;
    public String genMuzica;

    public Rezervare(Boolean laGeam, Boolean scauneErgonomice, Boolean masaDecorata, Boolean muzicaAmbientala, String genMuzica) {
        this.laGeam = laGeam;
        this.scauneErgonomice = scauneErgonomice;
        this.masaDecorata = masaDecorata;
        this.muzicaAmbientala = muzicaAmbientala;
        this.genMuzica = genMuzica;
    }

    public Boolean getLaGeam() {
        return laGeam;
    }

    public void setLaGeam(Boolean laGeam) {
        this.laGeam = laGeam;
    }

    public Boolean getScauneErgonomice() {
        return scauneErgonomice;
    }

    public void setScauneErgonomice(Boolean scauneErgonomice) {
        this.scauneErgonomice = scauneErgonomice;
    }

    public Boolean getMasaDecorata() {
        return masaDecorata;
    }

    public void setMasaDecorata(Boolean masaDecorata) {
        this.masaDecorata = masaDecorata;
    }

    public Boolean getMuzicaAmbientala() {
        return muzicaAmbientala;
    }

    public void setMuzicaAmbientala(Boolean muzicaAmbientala) {
        this.muzicaAmbientala = muzicaAmbientala;
    }

    public String getGenMuzica() {
        return genMuzica;
    }

    public void setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("laGeam=").append(laGeam);
        sb.append(", scauneErgonomice=").append(scauneErgonomice);
        sb.append(", masaDecorata=").append(masaDecorata);
        sb.append(", muzicaAmbientala=").append(muzicaAmbientala);
        sb.append(", genMuzica='").append(genMuzica).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
