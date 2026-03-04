import clase.*;

import java.io.FileNotFoundException;
import java.util.List;

//asta era inainte:
//import cts.s02.principii_clean_code.clase.Angajat;
//import cts.s02.principii_clean_code.clase.Utils;



public class Program {


	//ce facem seminarul asta: am primit un cod
	//la java numele interfetei interfata are sufixul "able": Serializable, Parceable, etc.
	//la C# numele interfatei are un I in fata

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		try {
			//schimbam aici, pentru ca am eliminat clasa util
			//functia .load nu este statica, este o metoda, asa ca ne trebuie instanta de AngajatiLoader


			//incalcare principiul Dependency Inversion (sa nu folosim clase concrete):
//			AngajatiLoader angajatiLoader = new AngajatiLoader();
//			listaAngajati = angajatiLoader.load("angajati.txt");

			//asa ca facem asta:
			IAplicantiLoaders loader = new AngajatiLoader();
			listaAngajati = loader.load("angajati.txt");

			//ce era inainte:
			//listaAngajati = Utils.readAngajati("angajati.txt");

			for(Aplicant angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
