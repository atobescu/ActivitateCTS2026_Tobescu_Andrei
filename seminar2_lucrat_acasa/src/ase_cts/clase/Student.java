package ase_cts.clase;

import java.util.Arrays;

public class Student extends Aplicant {
    protected String facultate;
    protected int anStudii;

    public int getAnStudii() {
        return anStudii;
    }

    public void setAnStudii(int anStudii) {
        this.anStudii = anStudii;
    }


    public Student() {
        super();

    }

    //de facut: private static Double sumaFinantare;
    @Override
    public void afisareFinantare() {

    }

    public Student(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect, String facultate, int an_studii) {
        super(nume, prenume, varsta, punctaj, nr_proiecte, denumireProiect);
        this.facultate = facultate;
        this.anStudii = an_studii;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append(super.toString());
        sb.append("facultate='").append(facultate).append('\'');
        sb.append(", anStudii=").append(anStudii);
        sb.append('}');
        return sb.toString();
    }

    public int finantare() {
        int s = 20;
        System.out.println("Studentul " + getNume() + " " + getPrenume() + " primeste" + s + " Euro/zi in proiect.");
        return s;
    }

}
