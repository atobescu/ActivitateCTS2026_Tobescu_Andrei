package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements Element{

    private String nume;
    private List<Element> listaAbstract = new ArrayList<>();

    @Override
    public void descriere() {
        System.out.println("Aceasta este categoria" + this.nume);
        for(Element element:listaAbstract){
            element.descriere();
        }
    }

    @Override
    public void adaugaNos(Element element) {
        listaAbstract.add(element);
    }

    @Override
    public void stergeNod(Element element) {
        listaAbstract.remove(element);
    }

    @Override
    public Element getNod(Integer index) {
        return listaAbstract.get(index);
    }

    public Categorie(String nume) {
        this.nume = nume;
    }
}
