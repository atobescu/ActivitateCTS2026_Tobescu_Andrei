package ro.ase.cts.clase;

import ro.ase.cts.command.IComanda;

public class Operator {
    private String nume;
    public void invoca(IComanda iComanda){
        iComanda.executa();
    }
}
