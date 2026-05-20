package ro.ase.cts.bucatarie;

public class Bucatarie implements IBucatarie{
    @Override
    public void printeaza(Comanda comanda) {
        System.out.println("Comanda este " + comanda.getProduse());
    }
}
