package ase_cts.clase;

import java.util.Arrays;

public abstract class Aplicant {
    protected String nume;
    protected String prenume;
    protected int varsta;
    protected int punctaj;
    protected int nrProiecte;
    protected String[] denumireProiect;


    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }


    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }


    //modificam functia: numele + la hardcodarea 80 facem un atribut static + operator ternar
//    public void statut() {
//        if (punctaj > 80)
//            System.out.println("Aplicantul " + nume + " " + prenume + " a fost acceptat.");
//        else
//            System.out.println("Aplicantul " + nume + " " + prenume + " nu a fost acceptat.");
//    }

    private static Integer punctajMinim = 90;

    public static Integer getPunctajMinim() {
        return punctajMinim;
    }

    public void AfiseazaStatut() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Aplicantul ");
        stringBuilder.append(this.nume).append(this.prenume);
        stringBuilder.append((punctaj > Aplicant.getPunctajMinim())?" ": " nu ");
        stringBuilder.append("a fost acceptat.");
        System.out.println(stringBuilder.toString());
    }




    public void setPunctaj(int punctaj) {
        this.punctaj = punctaj;
    }


    public Aplicant() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Aplicant(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect) {
        super();
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.punctaj = punctaj;
        this.nrProiecte = nr_proiecte;
        this.denumireProiect = denumireProiect;
    }



    public abstract void afisareFinantare();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Aplicant{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", prenume='").append(prenume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", punctaj=").append(punctaj);
        sb.append(", nrProiecte=").append(nrProiecte);
        sb.append(", denumireProiect=").append(Arrays.toString(denumireProiect));
        sb.append('}');
        return sb.toString();
    }
}
