package ro.ase.cts.clase;

import ro.ase.cts.observer.IObserver;

import java.util.ArrayList;
import java.util.List;

public class Agentie implements IPachet{
    List<IObserver> listaClienti;

    public Agentie() {
        this.listaClienti = new ArrayList<>();
    }

    @Override
    public void descriere() {
        System.out.println("Aceasta este lista de clienti: " + listaClienti.toString());
    }

    @Override
    public void abonareClient(IObserver iObserver) {
        listaClienti.add(iObserver);
    }

    @Override
    public void dezabonareClient(IObserver iObserver) {
        listaClienti.remove(iObserver);
    }

    @Override
    public void notificareObservatori(String mesaj) {
        for(IObserver iObserver: listaClienti){
            iObserver.anunta(mesaj);
        }
    }

    public void notificareOfertaNoua(){
        notificareObservatori("Atentie, a aparut o oferta noua");
    }
    public void notificarePachetNou(){
        notificareObservatori("Atentie, a aparut un pachet nou");
    }
}
