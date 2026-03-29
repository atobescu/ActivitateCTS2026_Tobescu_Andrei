package ase.cts.stb.simplefactory.clase;

import ase.cts.stb.prototype.MijlocTransportPrototype;

public class Troleibuz extends MijlocTransportPrototype implements IMijlocTransport{

    @Override
    public void descriere() {
        System.out.println("Sunt un troleibuz");
    }

    @Override
    public IMijlocTransport copiaza() {
        Troleibuz troleibuz = new Troleibuz();
        //deepcopy
        return troleibuz;
    }
}
