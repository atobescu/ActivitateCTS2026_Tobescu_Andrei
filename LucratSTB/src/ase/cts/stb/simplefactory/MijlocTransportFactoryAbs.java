package ase.cts.stb.simplefactory;


import ase.cts.stb.simplefactory.claseabs.Autobuz;
import ase.cts.stb.simplefactory.claseabs.MijlocTransport;
import ase.cts.stb.simplefactory.claseabs.Tramvai;
import ase.cts.stb.simplefactory.claseabs.Troleibuz;

public class MijlocTransportFactoryAbs {
    public MijlocTransport creeazaMijlocTransport(TipMijlocTransport tipMijlocTransport) throws Exception {
        switch (tipMijlocTransport){
            case Autobuz: {
                return new Autobuz();
            }
            case Tramvai: {
                return new Tramvai();
            }
            case Troleibuz:{
                return new Troleibuz();
            }
            default:
                throw new Exception("Nu exista acest tip de mijloc de transport");
        }
    }
}
