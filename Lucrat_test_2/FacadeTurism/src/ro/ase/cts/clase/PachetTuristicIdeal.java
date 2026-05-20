package ro.ase.cts.clase;

public class PachetTuristicIdeal {
        public void rezervaPachetIdeal(String numeHotel, String dataPlecare, String dataRevenire){
            RezervareHotel rezervareHotel = new RezervareHotel(numeHotel, 5);
            rezervareHotel.rezervaHotel();
            RezervareZbor rezervareZbor = new RezervareZbor(dataPlecare, dataRevenire);
            rezervareZbor.rezervaAvion();
            CrearePachetFinal crearePachetFinal = new CrearePachetFinal(dataPlecare,dataRevenire,numeHotel);
            crearePachetFinal.salveazaInSistem();
            System.out.println("Pachetul a fost salvat cu succes!");
        }
}

