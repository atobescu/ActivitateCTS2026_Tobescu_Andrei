package ro.ase.cts.clase;

public class PachetCazare implements IPachet{
    private String destinatie;

    @Override
    public void descriere() {
        System.out.println("Sunt un pachet ce contine cazare");
    }

    @Override
    public void rezerva() {
        System.out.println("Pachetul de cazare spre "+ this.destinatie + " a fost rezervat");
    }

    @Override
    public void vanzare() {
        System.out.println("Pachetul de cazare spre "+ this.destinatie + " a fost vandut");
    }
}
