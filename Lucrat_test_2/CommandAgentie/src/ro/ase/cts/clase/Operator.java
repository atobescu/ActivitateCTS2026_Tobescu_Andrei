package ro.ase.cts.clase;

import ro.ase.cts.command.IComanda;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private String nume;
    private List<IComanda> listaComenzi;

    public void invoca(IComanda iComanda){
        listaComenzi.add(iComanda);
        iComanda.executa();
    }

    public Operator() {
        this.listaComenzi = new ArrayList<>();
    }

    public void undo(){
        listaComenzi.remove(listaComenzi.size() - 1);
    }

    public void arataIstoricComenzi(){
        for(IComanda iComanda: listaComenzi){
            System.out.println(iComanda.toString());
        }
    }
}
