package ase_cts.clase;

import java.util.Arrays;

public class Elev extends Aplicant{
	private int clasa;
	private String tutore;
	



	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Elev{");
		sb.append("clasa=").append(clasa);
		sb.append(", tutore='").append(tutore).append('\'');
		sb.append('}');
		return sb.toString();
	}

	public Elev() {
		super();
	}


	private static Double sumaFinantare = 10.7;
	@Override
	public void afisareFinantare() {
		System.out.println("Elevul "+getNume()+" "+getPrenume()+" primeste" +Elev.sumaFinantare+ " Euro/zi in proiect.");
	}


	public void setClasa(int clasa) {
		this.clasa = clasa;
	}

	public void setTutore(String tutore) {
		this.tutore = tutore;
	}

}
