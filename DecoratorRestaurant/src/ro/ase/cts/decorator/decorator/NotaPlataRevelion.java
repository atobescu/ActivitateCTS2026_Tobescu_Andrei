package ro.ase.cts.decorator.decorator;

import ro.ase.cts.decorator.clase.NotaPlata;

public class NotaPlataRevelion extends NotaPlataDecorator{
    public NotaPlataRevelion(NotaPlata notaPlata) {
        super(notaPlata);
    }

    @Override
    public void printeazaFelizitare() {
        System.out.println("Nota plata de revelion a fost platita");
    }
}
