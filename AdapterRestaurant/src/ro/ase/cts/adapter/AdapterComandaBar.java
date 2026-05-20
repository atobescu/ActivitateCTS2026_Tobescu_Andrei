package ro.ase.cts.adapter;

import ro.ase.cts.bar.Bar;
import ro.ase.cts.bucatarie.Comanda;
import ro.ase.cts.bucatarie.IBucatarie;

public class AdapterComandaBar implements IBucatarie {
    private Bar bar;

    @Override
    public void printeaza(Comanda comanda) {
        bar.printeaza(comanda.toString());
    }

    public AdapterComandaBar(Bar bar) {
        this.bar = bar;
    }
}
