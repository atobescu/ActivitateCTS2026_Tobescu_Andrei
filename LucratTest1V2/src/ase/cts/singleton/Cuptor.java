package ase.cts.singleton;

import java.util.ArrayList;
import java.util.List;

public class Cuptor {
    private List<Preparat> listaAsteptare = new ArrayList<>();
    private Integer numarCuptor;
    private Integer temperaturaMaxima;

    public Integer getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public List<Preparat> getListaAsteptare() {
        return listaAsteptare;
    }

    public Integer getNumarCuptor() {
        return numarCuptor;
    }

    public void setNumarCuptor(Integer numarCuptor) {
        this.numarCuptor = numarCuptor;
    }

    public void setListaAsteptare(List<Preparat> listaAsteptare) {
        this.listaAsteptare = listaAsteptare;
    }

    public void setTemperaturaMaxima(Integer temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
    }
    //    private static Cuptor instanta = null;

    public Cuptor(List<Preparat> listaAsteptare, Integer numarCuptor) {
        this.listaAsteptare = listaAsteptare;
        this.numarCuptor = numarCuptor;
    }

//    public static synchronized Cuptor getInstanta(List<Preparat> listaAsteptare, Integer numarCuptor){
//        if (instanta == null){
//            instanta = new Cuptor(listaAsteptare, numarCuptor);
//        }
//        return instanta;
//    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cuptor{");
        sb.append("listaAsteptare=").append(listaAsteptare);
        sb.append(", numarCuptor=").append(numarCuptor);
        sb.append('}');
        return sb.toString();
    }
}
