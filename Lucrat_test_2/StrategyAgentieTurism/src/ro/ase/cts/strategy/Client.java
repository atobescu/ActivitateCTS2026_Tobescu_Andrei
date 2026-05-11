package ro.ase.cts.strategy;

public class Client {
    private String nume;
    private IModPlata iModPlata;

    public void plateste(){
        iModPlata.plateste();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public IModPlata getiModPlata() {
        return iModPlata;
    }

    public void setiModPlata(IModPlata iModPlata) {
        this.iModPlata = iModPlata;
    }

    public Client(String nume, IModPlata iModPlata) {
        this.nume = nume;
        this.iModPlata = iModPlata;
    }
}
