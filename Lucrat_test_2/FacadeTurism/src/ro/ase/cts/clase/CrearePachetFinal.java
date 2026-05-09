package ro.ase.cts.clase;

public class CrearePachetFinal extends RezervareZbor{
    private String numeHotel;
    private static Integer nrCrt = 0;

    public CrearePachetFinal(String dataPlecare, String dataRevenire, String numeHotel) {
        super(dataPlecare, dataRevenire);
        this.numeHotel = numeHotel;
    }

    public void salveazaInSistem(){
        System.out.println("Pachetul cu numarul " + nrCrt++ +" a fost salvat in sistem: "
                + this.numeHotel + ", de la data de "
                + super.dataPlecare + " pana la data de "
                + super.dataRevenire);
    }
}
