package ase.cts.singleton;

import java.util.ArrayList;
import java.util.List;

public class Comanda {
    private List<Preparat> listaPreparate = new ArrayList<>();

    public Comanda adaugaLaComanda(Preparat preparat){
        this.listaPreparate.add(preparat);
        return this;
    }

    public List<Preparat> getListaPreparate() {
        return listaPreparate;
    }

    public void setListaPreparate(List<Preparat> listaPreparate) {
        this.listaPreparate = listaPreparate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Comanda{");
        sb.append("listaPreparate=").append(listaPreparate);
        sb.append('}');
        return sb.toString();
    }
}
