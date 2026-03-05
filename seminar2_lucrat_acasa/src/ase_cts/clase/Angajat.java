package ase_cts.clase;

import java.util.Arrays;

public class Angajat extends Aplicant{
	private String ocupatie;
	private int salariu;
	

	public Angajat(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumire_Proiecte,int salariu,String ocupatie) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumire_Proiecte);
		this.salariu = salariu;
		this.ocupatie = ocupatie;
	}
	public Angajat() {
		super();
		
	}


	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Angajat{");
		sb.append("ocupatie='").append(ocupatie).append('\'');
		sb.append(", salariu=").append(salariu);
		sb.append('}');
		return sb.toString();
	}

	private static Double sumaFinantare;

	@Override
	public void afisareFinantare() {
		System.out.println("Angajatul "+getNume()+" "+getPrenume()+" primeste"+ Angajat.sumaFinantare +" Euro/zi in proiect.");
	}

	public static Double getSumaFinantare() {
		return sumaFinantare;
	}

	public static void setSumaFinantare(Double sumaFinantare) {
		Angajat.sumaFinantare = sumaFinantare;
	}
}
