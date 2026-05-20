package ro.ase.cts.main;

import ro.ase.cts.adapter.AdapterComandaBar;
import ro.ase.cts.bar.Bar;
import ro.ase.cts.bucatarie.Bucatarie;
import ro.ase.cts.bucatarie.Comanda;

public class Main {
    public static void main(String[] args) {
        Comanda comanda = new Comanda("produs1, produs2, produs3");

        Bucatarie bucatarie = new Bucatarie();
        bucatarie.printeaza(comanda);

        Bar bar = new Bar();
        //bar.printeaza(comanda);

        AdapterComandaBar adapterComandaBar = new AdapterComandaBar(bar);
        adapterComandaBar.printeaza(comanda);
    }
}