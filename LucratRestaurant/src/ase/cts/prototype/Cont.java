package ase.cts.prototype;

import java.util.ArrayList;
import java.util.List;

public class Cont implements ContPrototype{

    private String nume;
    private Integer varsta;
    private List<String> listaPreferinte;

    public List<String> getListaPreferinte() {
        return listaPreferinte;
    }

    public void setListaPreferinte(List<String> listaPreferinte) {
        this.listaPreferinte = listaPreferinte;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Cont() {
        this.nume = "-";
        this.varsta = -1;
        this.listaPreferinte = null;
    }

    public Cont(String nume, Integer varsta, List<String> listaPreferinte) {
        this.nume = nume;
        this.varsta = varsta;
        this.listaPreferinte = listaPreferinte;
    }

    @Override
    public Cont clone() {
        Cont cont = new Cont();
        cont.setNume(this.nume);
        cont.setVarsta(this.varsta);
        List<String> listaPreferinte = new ArrayList<>();
        for(String preferinta: this.listaPreferinte){
            listaPreferinte.add(preferinta);
        }
        cont.setListaPreferinte(listaPreferinte);
        return cont;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cont{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", listaPreferinte=").append(listaPreferinte);
        sb.append('}');
        return sb.toString();
    }
}
