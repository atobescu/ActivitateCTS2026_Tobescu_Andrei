package ro.ase.cts.clase;

import ro.ase.cts.observer.IObserver;

public interface IPachet {
    public void descriere();
    public void abonareClient(IObserver iObserver);
    public void dezabonareClient(IObserver iObserver);
    public void notificareObservatori(String mesaj);
}
