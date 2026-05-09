package ro.ase.cts.clase_initiale;

public class PachetTransport implements IPachet{
    @Override
    public void descriere() {
        System.out.println("Acest pachet contine doar transport (aerian/feroviar)");
    }
}
