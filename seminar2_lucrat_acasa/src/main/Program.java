package main;

import clase.Angajat;
import clase.Aplicant;
import clase.file_management.AngajatReader;
import clase.file_management.Utils;

import java.io.FileNotFoundException;
import java.util.List;


//rezolv: single responsability din clasa Utils


public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		AngajatReader angajatReader = new AngajatReader();

		try {
			listaAngajati = angajatReader.readAplicanti("angajati.txt");

			for(Aplicant angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
