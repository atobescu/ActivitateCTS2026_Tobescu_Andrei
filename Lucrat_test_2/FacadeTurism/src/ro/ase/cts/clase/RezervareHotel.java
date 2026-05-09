package ro.ase.cts.clase;

public class RezervareHotel {
    private String numeHotel;
    private Integer durata;

    public void rezervaHotel(){
        System.out.println("Rezervarea hotelului a fost facuta pentru " + this.numeHotel + " pe o perioada de "+ this.durata);
    }

    public RezervareHotel(String numeHotel, Integer durata) {
        this.numeHotel = numeHotel;
        this.durata = durata;
    }
}
