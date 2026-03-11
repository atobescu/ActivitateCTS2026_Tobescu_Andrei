package ase_cts.clase;

import java.util.Arrays;

public class Angajat extends Aplicant{
	private String ocupatie;
	private int salariu;
	

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

	private static Double sumaFinantare = 100.5;

	@Override
	public void afisareFinantare() {
		System.out.println("Angajatul "+getNume()+" "+getPrenume()+" primeste "+ Angajat.sumaFinantare +" Euro/zi in proiect.");
	}


	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}

	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}
}
