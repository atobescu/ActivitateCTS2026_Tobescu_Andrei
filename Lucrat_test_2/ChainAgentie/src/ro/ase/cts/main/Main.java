package ro.ase.cts.main;

import ro.ase.cts.chain.*;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Marcel","","");
        Client client2 = new Client("Marius","kjredcnjkwd","fedx");
        Client client3 = new Client("Mihai","frecdsx","fedcfed");
        Client client4 = new Client("Madalin","","grfv");
        Client client5 = new Client("Mircea","fdcsx","");

        HandlerSMS handlerSMS = new HandlerSMS();
        HandlerMail handlerMail = new HandlerMail();
        HandlerMissingInfo handlerMissingInfo = new HandlerMissingInfo();

        handlerSMS.setHandler(handlerMail);
        handlerMail.setHandler(handlerMissingInfo);

        handlerSMS.notifica(client5, "mesaj lala");
    }
}