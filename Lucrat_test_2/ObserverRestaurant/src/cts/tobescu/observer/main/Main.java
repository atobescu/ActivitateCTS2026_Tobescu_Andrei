package cts.tobescu.observer.main;

import cts.tobescu.observer.model.ClientFidel;
import cts.tobescu.observer.model.Noutate;
import cts.tobescu.observer.model.OfertaPret;
import cts.tobescu.observer.model.ProdusNou;

public class Main {
    public static void main(String[] args) {
        ClientFidel clientFidel1 = new ClientFidel("Marcel");
        ClientFidel clientFidel2 = new ClientFidel("Mirel");
        ClientFidel clientFidel3 = new ClientFidel("Max");

        Noutate ofertaPret = new OfertaPret();
        ofertaPret.abonareObservator(clientFidel1);

        Noutate produseNoi = new ProdusNou();
        produseNoi.abonareObservator(clientFidel1);
        produseNoi.abonareObservator(clientFidel2);
        produseNoi.abonareObservator(clientFidel3);

        ofertaPret.notificareObservatori();
        produseNoi.notificareObservatori();
    }
}