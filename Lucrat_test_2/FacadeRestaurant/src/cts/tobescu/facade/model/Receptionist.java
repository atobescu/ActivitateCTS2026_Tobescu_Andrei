package cts.tobescu.facade.model;

public class Receptionist {
    private String nume;

    public Receptionist(String nume) {
        this.nume = nume;
    }

    public void verificaMasa(Facade facade){
        facade.verificaMasa();
    }
}
