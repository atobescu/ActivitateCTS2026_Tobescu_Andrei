package ase.cts.main;

import ase.cts.proxy.clase.Autobuz;
import ase.cts.proxy.clase.ProxyAutobuz;
import ase.cts.proxy.clase.ProxyAutobuzCursaSpeciala;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz1 = new Autobuz(312, 0);
        ProxyAutobuz autobuzNoapte = new ProxyAutobuz(autobuz1);

        autobuzNoapte.opresteInStatie();
        //autobuzNoapte.coboaraCalatori(1);
        autobuzNoapte.opresteInStatie();

        ProxyAutobuzCursaSpeciala autobuzCursaSpeciala = new ProxyAutobuzCursaSpeciala(autobuz1);
        autobuzCursaSpeciala.opresteInStatie();



    }
}