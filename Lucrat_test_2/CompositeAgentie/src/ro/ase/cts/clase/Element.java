package ro.ase.cts.clase;

public interface Element {
    public void descriere();
    public void adaugaNos(Element element) throws Exception;
    public void stergeNod(Element element) throws Exception;
    public Element getNod(Integer index) throws Exception;
}
