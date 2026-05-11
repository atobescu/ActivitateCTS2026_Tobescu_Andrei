package ro.ase.cts.strategy;

public class PlataCard implements IModPlata{
    @Override
    public void plateste() {
        System.out.println("Plata a fost facuta cu cardul");
    }
}
