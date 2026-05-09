package ro.ase.cts.decorator;

import ro.ase.cts.clase_initiale.IPachet;
import ro.ase.cts.clase_initiale.PachetTransport;

public abstract class PachetAnulabil implements IPachet {
    protected IPachet iPachet;

    public PachetAnulabil(IPachet iPachet) {
        this.iPachet = iPachet;
    }
    public void anulare(){};
}
