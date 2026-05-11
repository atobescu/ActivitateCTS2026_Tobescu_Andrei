package ro.ase.cts.observer;

public class Client implements IObserver{
    private String NumeClient;
    @Override
    public void anunta(String mesaj) {
        System.out.println(this.NumeClient + " ai un nou mesaj: " + mesaj);
    }

    public Client(String numeClient) {
        NumeClient = numeClient;
    }
}
