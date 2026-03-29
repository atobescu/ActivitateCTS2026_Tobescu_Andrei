package ase.cts.stb.simplefactory;

import ase.cts.stb.simplefactory.clase.Autobuz;
import ase.cts.stb.simplefactory.clase.IMijlocTransport;
import ase.cts.stb.simplefactory.clase.Tramvai;
import ase.cts.stb.simplefactory.clase.Troleibuz;

public class MijlocTransportFactory {
    public IMijlocTransport creeazaMijlocTransport(TipMijlocTransport tipMijlocTransport) throws Exception {
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
