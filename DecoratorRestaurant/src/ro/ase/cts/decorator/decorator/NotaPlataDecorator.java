package ro.ase.cts.decorator.decorator;

import ro.ase.cts.decorator.clase.INotaPlata;
import ro.ase.cts.decorator.clase.NotaPlata;

public abstract class NotaPlataDecorator implements INotaPlata {

    private NotaPlata notaPlata;


    @Override
    public void printeaza() {
        notaPlata.printeaza();
    }

    public NotaPlataDecorator(NotaPlata notaPlata) {
        this.notaPlata = notaPlata;
    }

    public abstract void printeazaFelizitare();
}
