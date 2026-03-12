package simple_factory_stb.fabrica;

import simple_factory_stb.familie_clase.Autobuz;
import simple_factory_stb.familie_clase.MijlocDeTransport;
import simple_factory_stb.familie_clase.Tramvai;
import simple_factory_stb.familie_clase.Troleibuz;

public class MijlocTransportFactory {
    public MijlocDeTransport getMijlocDeTransport(MijlocDeTransportType tip, String marca, Integer linie){
        switch (tip){
            case MijlocDeTransportType.AUTOBUZ:
                return new Autobuz(marca, linie);
            case MijlocDeTransportType.TRAMVAI:
                return new Tramvai(marca, linie);
            case MijlocDeTransportType.TROLEIBUZ:
                return new Troleibuz(marca, linie);
        }
        return null;
    }
}
