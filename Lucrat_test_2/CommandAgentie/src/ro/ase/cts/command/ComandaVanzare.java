package ro.ase.cts.command;

import ro.ase.cts.clase.IPachet;

public class ComandaVanzare implements IComanda{

    private IPachet iPachet;

    public ComandaVanzare(IPachet iPachet) {
        this.iPachet = iPachet;
    }

    @Override
    public void executa() {
        iPachet.vanzare();
    }
}
