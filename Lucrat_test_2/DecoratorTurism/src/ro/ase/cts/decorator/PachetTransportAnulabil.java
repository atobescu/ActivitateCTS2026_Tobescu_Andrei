package ro.ase.cts.decorator;

import ro.ase.cts.clase_initiale.IPachet;
import ro.ase.cts.clase_initiale.PachetTransport;

public class PachetTransportAnulabil extends PachetAnulabil {

    public PachetTransportAnulabil(IPachet iPachet) {
        super(iPachet);
    }

    @Override
    public void descriere() {
        super.iPachet.descriere();
    }

    @Override
    public void anulare() {
        System.out.println("Pachetul a fost anulat");
    }
}
