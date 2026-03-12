package ro_ase_cts.lazy_hotel;

public class Hotel {
    private String denumire;
    private Integer nrCamere;
    private Integer nrCamereInchiriate;
    private Integer nrAngajati;

    public void afiseazaInchiriereCamera(){
        if(nrCamereInchiriate.equals(nrCamere)){
            System.out.println("Toate camerele au fost inchiriate!");
        }else {
            System.out.println("Camera x fost inchiriata");
            nrCamereInchiriate++;
        }
    }

    public void afiseazaDescriere(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hotelul se numeste ");
        stringBuilder.append(denumire);
        stringBuilder.append(", are ");
        stringBuilder.append(nrCamere);
        stringBuilder.append(" camere si are");
        stringBuilder.append(nrAngajati);
        stringBuilder.append(" angajati.");
        System.out.println(stringBuilder.toString());
    }


    private static Hotel instanta = null;

    private Hotel(String denumire, Integer nrCamere, Integer nrAngajati) {
        this.denumire = denumire;
        this.nrCamere = nrCamere;
        this.nrAngajati = nrAngajati;
        this.nrCamereInchiriate = 0;
    }

    //threadsafe:
    public static synchronized Hotel getInstanta(String denumire, Integer nrCamere, Integer nrAngajati){
        if(Hotel.instanta == null){
            Hotel.instanta = new Hotel(denumire, nrCamere, nrAngajati);
        }
        return instanta;
    }
}
