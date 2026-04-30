package ro.ase.cts.main;

public class AutobuzLinie implements ILinieTransport{

    private String model;
    private Integer anFabricatie;
    private Integer numarMaxLocuri;


    public AutobuzLinie(String model, Integer anFabricatie, Integer numarMaxLocuri) {
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.numarMaxLocuri = numarMaxLocuri;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getAnFabricatie() {
        return anFabricatie;
    }

    public void setAnFabricatie(Integer anFabricatie) {
        this.anFabricatie = anFabricatie;
    }

    public Integer getNumarMaxLocuri() {
        return numarMaxLocuri;
    }

    public void setNumarMaxLocuri(Integer numarMaxLocuri) {
        this.numarMaxLocuri = numarMaxLocuri;
    }

    @Override
    public void afiseaza(DetaliiLinie detaliiLinie) {
        System.out.println("Autobuzul " + this.model +
                " este fabricat in anul " + this.anFabricatie +
                " si are maxim " + this.numarMaxLocuri);
    }
}
