package simple_factory_stb.familie_clase;

public class Troleibuz extends MijlocDeTransport {

    public Troleibuz(String marca, Integer linie) {
        super(marca, linie);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Troleibuzul " + super.getMarca());
    }
}
