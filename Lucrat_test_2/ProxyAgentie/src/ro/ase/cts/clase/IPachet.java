package ro.ase.cts.clase;

public abstract class IPachet {
    public void descriere(){};
    public void rezerva(){};
    protected Double pret;
    protected Integer varstaPersoana;

    public IPachet(Double pret, Integer varstaPersoana) {
        this.pret = pret;
        this.varstaPersoana = varstaPersoana;
    }
}
