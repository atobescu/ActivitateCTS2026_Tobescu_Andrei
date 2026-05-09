package ro.ase.cts.pachete_existente;

public class PachetCazare implements IPachet{
    private Double pret;
    @Override
    public void descriere() {
        System.out.println("Pachetul contine cazare");
    }

    @Override
    public void getPret() {
        System.out.println("Pretul pachetului este de "+ this.pret);
    }

    public PachetCazare(Double pret) {
        this.pret = pret;
    }
}
