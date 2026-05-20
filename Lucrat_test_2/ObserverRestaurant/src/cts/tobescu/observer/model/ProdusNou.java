package cts.tobescu.observer.model;

public class ProdusNou extends Noutate{
    @Override
    public void notificareObservatori() {
        for(IObserver iObserver:listaClientiFideli){
            iObserver.notifica("Ai un produs nou!");
        }
    }
}
