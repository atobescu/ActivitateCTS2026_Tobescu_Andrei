package ro.ase.cts.main;

import ro.ase.cts.clase.Agentie;
import ro.ase.cts.observer.Client;

public class Main {
    public static void main(String[] args) {
        Agentie agentie = new Agentie();
        Client client1 = new Client("Marcel");
        Client client2 = new Client("Marius");
        Client client3 = new Client("Mihai");
        agentie.abonareClient(client1);
        agentie.abonareClient(client2);
        agentie.abonareClient(client3);

        agentie.dezabonareClient(client3);

        agentie.notificareOfertaNoua();
        agentie.notificarePachetNou();
    }
}