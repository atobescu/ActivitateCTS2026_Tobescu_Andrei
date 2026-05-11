package ro.ase.cts.clase;

public class PachetTransport implements IPachet{
    private String destinatie;
    @Override
    public void descriere() {
        System.out.println("Sunt un pachet ce contine transport");
    }

    @Override
    public void rezerva() {
        System.out.println("Pachetul de transport spre "+ this.destinatie + " a fost rezervat");
    }

    @Override
    public void vanzare() {
        System.out.println("Pachetul de transport spre "+ this.destinatie + " a fost vandut");
    }
}
