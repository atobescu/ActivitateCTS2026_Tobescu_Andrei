package cts.tobescu.observer.model;

public class OfertaPret extends Noutate{
    @Override
    public void notificareObservatori() {
        for(IObserver iObserver:listaClientiFideli){
            iObserver.notifica("Ai o oferta noua!");
        }
    }
}
