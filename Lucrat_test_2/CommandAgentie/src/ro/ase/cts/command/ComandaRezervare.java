package ro.ase.cts.command;

import ro.ase.cts.clase.IPachet;
import ro.ase.cts.clase.Operator;
import ro.ase.cts.clase.PachetCazare;
import ro.ase.cts.clase.PachetTransport;

public class ComandaRezervare implements IComanda{
    private IPachet iPachet;

    public ComandaRezervare(IPachet iPachet) {
        this.iPachet = iPachet;
    }

    @Override
    public void executa() {
        iPachet.rezerva();
    }
}
