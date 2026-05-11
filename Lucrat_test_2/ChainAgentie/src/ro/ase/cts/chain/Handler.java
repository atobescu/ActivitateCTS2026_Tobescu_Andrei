package ro.ase.cts.chain;

public abstract class Handler {
    public Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public void notifica(Client client, String mesaj){};
}
