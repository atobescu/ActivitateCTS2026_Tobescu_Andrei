package ase_cts.main;

import ase_cts.clase.Aplicant;
import ase_cts.clase.file_management.AngajatReader;

import java.io.FileNotFoundException;
import java.util.List;


public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		AngajatReader angajatReader = new AngajatReader();

		try {
			listaAngajati = angajatReader.readAplicanti("angajati.txt");

			for(Aplicant angajat : listaAngajati){
				System.out.println(angajat.toString());
				//aici afisam finantarea pentru fiecare angajat
				angajat.afisareFinantare();
				//afisam statutul pentru fiecare angajat
				angajat.AfiseazaStatut();
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}

}
