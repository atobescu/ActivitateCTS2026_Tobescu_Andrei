package ro.ase.cts.main;

import ro.ase.cts.decorator.clase.NotaPlata;
import ro.ase.cts.decorator.decorator.NotaPlata1Mai;
import ro.ase.cts.decorator.decorator.NotaPlataDecorator;
import ro.ase.cts.decorator.decorator.NotaPlataRevelion;

public class Main {
    public static void main(String[] args) {

        //problema 7 de la restaurant
        //momentan fara implementare de design pattern:
        NotaPlata notaPlata = new NotaPlata(100.0, "17.02.2026");
        notaPlata.printeaza();

        //cu decorator:

        Boolean esteRevelion = Boolean.FALSE;

        NotaPlataDecorator notaPlataDecorator = null;

        if(esteRevelion){
            notaPlataDecorator = new NotaPlataRevelion(notaPlata);
        }else{
            notaPlataDecorator = new NotaPlata1Mai(notaPlata);
        }
        notaPlataDecorator.printeazaFelizitare();
    }
}