package ase.cts.stb.simplefactory.clase;

import ase.cts.stb.prototype.MijlocTransportPrototype;

public class Tramvai extends MijlocTransportPrototype implements IMijlocTransport{
    @Override
    public void descriere() {
        System.out.println("Sunt un tramvai");
    }

    @Override
    public IMijlocTransport copiaza() {
        Tramvai tramvai = new Tramvai();
        //deep copy
        return tramvai;
    }
}
