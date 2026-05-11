package ro.ase.cts.main;

import ro.ase.cts.strategy.Client;
import ro.ase.cts.strategy.PlataPayPal;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Marcel", new PlataPayPal());
        client.plateste();
    }
}