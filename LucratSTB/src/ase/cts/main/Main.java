package ase.cts.main;

import ase.cts.stb.builder.AutobuzLinie;
import ase.cts.stb.builder.AutobuzLinieBuilder;
import ase.cts.stb.simplefactory.MijlocTransportFactory;
import ase.cts.stb.simplefactory.MijlocTransportFactoryAbs;
import ase.cts.stb.simplefactory.TipMijlocTransport;
import ase.cts.stb.simplefactory.clase.Autobuz;
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

        //problema 2 (clone-ul este in clasa abstracta;
        // nu este un prototype clasic, metoda clone returneaza interfata care este implementata de obiecte
        // am facut asta, ca sa putem face clone la toate tipurile de mijloace de transport)
        Autobuz autobuz = new Autobuz();
        autobuz.setMarca("Mercedes");
        System.out.println(autobuz.getMarca());
        Autobuz autobuz2 = autobuz.copiaza();
        autobuz.setMarca("Alta marca");
        System.out.println(autobuz2.getMarca());

        //problema 3:
//        AutobuzLinieBuilder builder = new AutobuzLinieBuilder();
//        AutobuzLinie autobuzLinie = builder.build();
//        autobuzLinie.setTextDerulator("Hello world");
//        System.out.println(autobuzLinie.toString());
//        //practic, fiecare setModel/orice setter, modifica cum creeaza builderul obiectele
//        AutobuzLinie autobuzLinie2 = builder.setModel("Mercedes").build();
//        System.out.println(autobuzLinie2.toString());
//        AutobuzLinieBuilder builder2 = new AutobuzLinieBuilder();
//        AutobuzLinie autobuzLinie3 = builder2.build();
//        System.out.println(autobuzLinie3.toString());
        //problema 3 cu singleton:
        AutobuzLinieBuilder builder = AutobuzLinieBuilder.getInstanta();
        AutobuzLinie autobuzLinie = builder.build();
        autobuzLinie.setTextDerulator("Hello world");
        System.out.println(autobuzLinie.toString());
        //practic, fiecare setModel/orice setter, modifica cum creeaza builderul obiectele
        AutobuzLinie autobuzLinie2 = builder.setModel("Mercedes").build();
        System.out.println(autobuzLinie2.toString());
        AutobuzLinieBuilder builder2 = AutobuzLinieBuilder.getInstanta();
        //acum ca am facut singleton, nu mai merge sa ai altfel de builder, trebuie sa il modific pe primul (unicul)
        AutobuzLinie autobuzLinie3 = builder2.build();
        System.out.println(autobuzLinie3.toString());

    }
}