package ro.ase.cts.composite;

import ro.ase.cts.clase.Element;

public class SubCategorie implements Element {

    private String nume;

    @Override
    public void descriere() {
        System.out.println("Sub categoria este numita " + this.nume);
    }

    @Override
    public void adaugaNos(Element element) throws Exception {
        throw new Exception("Nu este implementat!");
    }

    @Override
    public void stergeNod(Element element) throws Exception {
        throw new Exception("Nu este implementat!");
    }

    @Override
    public Element getNod(Integer index) throws Exception {
        throw new Exception("Nu este implementat!");
    }

    public SubCategorie(String nume) {
        this.nume = nume;
    }
}
