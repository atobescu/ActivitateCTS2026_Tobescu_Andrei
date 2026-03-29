package ase.cts.stb.simplefactory.clase;

import ase.cts.stb.prototype.MijlocTransportPrototype;
import ase.cts.stb.simplefactory.claseabs.MijlocTransport;

public class Autobuz extends MijlocTransportPrototype implements IMijlocTransport{

    private String marca;

    @Override
    public void descriere() {
        System.out.println("Sunt un autobuz");
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public Autobuz copiaza() {
        Autobuz autobuz = new Autobuz();
        //deep copy
        autobuz.setMarca(this.marca);
        return autobuz;
    }
}
