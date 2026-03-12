package simple_factory_stb.familie_clase;

public class Tramvai extends MijlocDeTransport {

    public Tramvai(String marca, Integer linie) {
        super(marca, linie);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Tramvaiul " + super.getMarca());
    }
}
