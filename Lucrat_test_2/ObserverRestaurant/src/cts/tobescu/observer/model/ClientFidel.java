package cts.tobescu.observer.model;

public class ClientFidel implements IObserver{
    private String nume;

    public ClientFidel(String nume) {
        this.nume = nume;
    }

    @Override
    public void notifica(String mesaj) {
        System.out.println(this.nume + ", vezi ca: " + mesaj);
    }
}
