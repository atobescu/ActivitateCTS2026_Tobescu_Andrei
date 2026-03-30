package ase.cts.builder;

public class RezervareBuilder implements IBuilder{

    private Rezervare rezervare;

    @Override
    public Rezervare build() {
        return rezervare;
    }

    public RezervareBuilder() {
        rezervare = new Rezervare(Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, "-");
    }

    public RezervareBuilder setlaGeam(Boolean laGeam){
        rezervare.setLaGeam(laGeam);
        return this;
    }

    public RezervareBuilder setscauneErgonomice (Boolean scauneErgonomice){
        rezervare.setScauneErgonomice(scauneErgonomice);
        return this;
    }

    public RezervareBuilder setmasaDecorata (Boolean masaDecorata){
        rezervare.setMasaDecorata(masaDecorata);
        return this;
    }

    public RezervareBuilder setmuzicaAmbientala (Boolean muzicaAmbientala){
        rezervare.setMuzicaAmbientala(muzicaAmbientala);
        return this;
    }

    public RezervareBuilder setGenMuzica (String genMuzica){
        rezervare.setGenMuzica(genMuzica);
        return this;
    }
}
