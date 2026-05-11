package ro.ase.cts.chain;

public class Client {
    private String nume;
    private String email;
    private String nrTel;

    public Client(String nume, String email, String nrTel) {
        this.nume = nume;
        this.email = email;
        this.nrTel = nrTel;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNrTel() {
        return nrTel;
    }

    public void setNrTel(String nrTel) {
        this.nrTel = nrTel;
    }
}
