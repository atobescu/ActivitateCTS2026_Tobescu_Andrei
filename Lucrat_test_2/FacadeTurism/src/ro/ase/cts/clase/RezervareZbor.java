package ro.ase.cts.clase;

public class RezervareZbor {
    protected String dataPlecare;
    protected String dataRevenire;

    public void rezervaAvion(){
        System.out.println("Zbor rezervat de la " + this.dataPlecare + " pana la " + this.dataRevenire);
    }

    public RezervareZbor(String dataPlecare, String dataRevenire) {
        this.dataPlecare = dataPlecare;
        this.dataRevenire = dataRevenire;
    }
}
