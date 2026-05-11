package ro.ase.cts.strategy;

public class PlataCash implements IModPlata{
    @Override
    public void plateste() {
        System.out.println("Plata a fost facuta cash");
    }
}
