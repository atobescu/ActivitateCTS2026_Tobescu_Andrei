package cts.tobescu.facade.model;

public class Masa {
    String nume;
    Boolean esteOcupata;
    Boolean esteDebarasata;
    Boolean areServeteleNoi;

    public Masa(String nume) {
        this.nume = nume;
        esteDebarasata = Boolean.TRUE;
        esteOcupata = Boolean.FALSE;
        areServeteleNoi = Boolean.TRUE;
    }

    public Boolean getEsteOcupata() {
        return esteOcupata;
    }

    public void setEsteOcupata(Boolean esteOcupata) {
        this.esteOcupata = esteOcupata;
    }

    public Boolean getEsteDebarasata() {
        return esteDebarasata;
    }

    public void setEsteDebarasata(Boolean esteDebarasata) {
        this.esteDebarasata = esteDebarasata;
    }

    public Boolean getAreServeteleNoi() {
        return areServeteleNoi;
    }

    public void setAreServeteleNoi(Boolean areServeteleNoi) {
        this.areServeteleNoi = areServeteleNoi;
    }

    public String getNume() {
        return nume;
    }
}
