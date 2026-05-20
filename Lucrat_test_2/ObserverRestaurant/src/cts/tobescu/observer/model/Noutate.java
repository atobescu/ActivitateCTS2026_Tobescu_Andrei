package cts.tobescu.observer.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Noutate {
    List<IObserver> listaClientiFideli = new ArrayList<>();

    public void abonareObservator(IObserver iObserver){
        listaClientiFideli.add(iObserver);
    }
    public void dezabonareObservator(IObserver iObserver){
        listaClientiFideli.remove(iObserver);
    }
    public void notificareObservatori(){

    }
}
