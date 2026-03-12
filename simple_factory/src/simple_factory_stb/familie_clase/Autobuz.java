package simple_factory_stb.familie_clase;

public class Autobuz extends MijlocDeTransport {

    public Autobuz(String marca, Integer linie) {
        super(marca, linie);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Autobuzul " + super.getMarca());
    }

}
