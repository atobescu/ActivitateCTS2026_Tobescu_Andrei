package ase.cts.main;

import ase.cts.stb.simplefactory.MijlocTransportFactory;
import ase.cts.stb.simplefactory.MijlocTransportFactoryAbs;
import ase.cts.stb.simplefactory.TipMijlocTransport;
import ase.cts.stb.simplefactory.clase.IMijlocTransport;
import ase.cts.stb.simplefactory.claseabs.MijlocTransport;

public class Main {
    public static void main(String[] args) throws Exception {
        //problema 1 (cu interfata):
        MijlocTransportFactory factory = new MijlocTransportFactory();
        IMijlocTransport tramvai1 = factory.creeazaMijlocTransport(TipMijlocTransport.Tramvai);
        tramvai1.descriere();
        //problema 1 (cu clasa abstracta):
        MijlocTransportFactoryAbs factoryAbs = new MijlocTransportFactoryAbs();
        MijlocTransport troleibuz = factoryAbs.creeazaMijlocTransport(TipMijlocTransport.Troleibuz);
        troleibuz.descriere();
    }
}