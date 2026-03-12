package simple_factory_stb.familie_clase;

public abstract class MijlocDeTransport {
    public abstract void afiseazaDescriere();

    private String marca;
    private Integer linie;

    public MijlocDeTransport(String marca, Integer linie) {
        this.marca = marca;
        this.linie = linie;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MijlocDeTransport{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", linie=").append(linie);
        sb.append('}');
        return sb.toString();
    }

    public String getMarca() {
        return marca;
    }
}
