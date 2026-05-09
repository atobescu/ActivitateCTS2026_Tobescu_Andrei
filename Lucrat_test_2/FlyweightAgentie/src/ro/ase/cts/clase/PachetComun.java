package ro.ase.cts.clase;

import java.util.Optional;

public class PachetComun implements IPachet{
    private Integer codPachet;
    private String numeHotel;
    private String destinatie;
    private Boolean areMicDejun;

    public PachetComun(Integer codPachet, String numeHotel, String destinatie, Boolean areMicDejun) {
        this.codPachet = codPachet;
        this.numeHotel = numeHotel;
        this.destinatie = destinatie;
        this.areMicDejun = areMicDejun;
    }

    public Integer getCodPachet() {
        return codPachet;
    }

    public void setCodPachet(Integer codPachet) {
        this.codPachet = codPachet;
    }

    public String getNumeHotel() {
        return numeHotel;
    }

    public void setNumeHotel(String numeHotel) {
        this.numeHotel = numeHotel;
    }

    public String getDestinatie() {
        return destinatie;
    }

    public void setDestinatie(String destinatie) {
        this.destinatie = destinatie;
    }

    public Boolean getAreMicDejun() {
        return areMicDejun;
    }

    public void setAreMicDejun(Boolean areMicDejun) {
        this.areMicDejun = areMicDejun;
    }

    public PachetComun() {
    }

    @Override
    public void descriesePachet(PachetInPlus pachetInPlus) {
        System.out.println("Pachetul cu numarul " + this.codPachet +
                " are destinatia "+ this.destinatie +
                " si veti sta in hotelul " + this.numeHotel +
                (areMicDejun?" cu":" fara") + " mic dejun" +
                " de asemenea are in plus asta " + (pachetInPlus.toString()));
    }

}
