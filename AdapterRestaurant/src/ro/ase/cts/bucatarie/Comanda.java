package ro.ase.cts.bucatarie;

public class Comanda {
    private String produse;

    public String getProduse() {
        return produse;
    }

    public void setProduse(String produse) {
        this.produse = produse;
    }

    public Comanda(String produse) {
        this.produse = produse;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Comanda{");
        sb.append("produse='").append(produse).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
