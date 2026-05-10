package ro.ase.cts.clase;

public class ProxyPachetTransport extends IPachet{
    private PachetTransport pachetTransport;

    public ProxyPachetTransport(Double pret, Integer varstaPersoana) {
        super(pret, varstaPersoana);
    }

    public ProxyPachetTransport(PachetTransport pachetTransport) {
        super(pachetTransport.pret, pachetTransport.varstaPersoana);
        this.pachetTransport = pachetTransport;
    }

    @Override
    public void descriere() {
        pachetTransport.descriere();
    }

    @Override
    public void rezerva() {
        if(super.varstaPersoana > 65){
            pachetTransport.rezerva();
        }else{
            System.out.println("Pachetul de transport este doar pentru pensionari");
        }
    }
}
