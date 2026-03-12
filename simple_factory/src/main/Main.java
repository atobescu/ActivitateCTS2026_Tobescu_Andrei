package main;

import simple_factory_stb.fabrica.MijlocDeTransportType;
import simple_factory_stb.fabrica.MijlocTransportFactory;
import simple_factory_stb.familie_clase.MijlocDeTransport;

public class Main {

//    public static void afisareMijlocDeTransport(){
//
//    }

    public static void main(String[] args) {
        MijlocTransportFactory factory = new MijlocTransportFactory();
        MijlocDeTransport autobuz = factory.getMijlocDeTransport(MijlocDeTransportType.AUTOBUZ,
                "Mercedes",
                232);
        MijlocDeTransport tramvai = factory.getMijlocDeTransport(MijlocDeTransportType.TRAMVAI,
                "Astra",
                1);
        MijlocDeTransport troleibuz = factory.getMijlocDeTransport(MijlocDeTransportType.TROLEIBUZ,
                "Otokar",
                55);

        autobuz.afiseazaDescriere();
        tramvai.afiseazaDescriere();
        troleibuz.afiseazaDescriere();

    }
}