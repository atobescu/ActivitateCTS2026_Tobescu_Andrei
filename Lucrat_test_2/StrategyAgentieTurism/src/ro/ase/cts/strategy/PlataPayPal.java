package ro.ase.cts.strategy;

public class PlataPayPal implements IModPlata{
    @Override
    public void plateste() {
        System.out.println("Plata a fost facuta prin paypal");
    }
}
