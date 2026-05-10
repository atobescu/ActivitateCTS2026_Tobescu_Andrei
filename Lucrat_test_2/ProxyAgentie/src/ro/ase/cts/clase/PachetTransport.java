package ro.ase.cts.clase;

public class PachetTransport extends IPachet{


    public PachetTransport(Double pret, Integer varstaPersoana) {
        super(pret, varstaPersoana);
    }

    public Double getPret() {
        return pret;
    }

    public void setPret(Double pret) {
        super.pret = pret;
    }

    @Override
    public void descriere() {
        System.out.println("Pachetul de transport costa "+ this.pret + " lei.");
    }

    @Override
    public void rezerva() {
        System.out.println("Pachetul de transport a fost rezervat");
    }
}
