package ase_cts.clase.file_management;

import ase_cts.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class Readers {
    public abstract List<Aplicant> readAplicanti(String file) throws FileNotFoundException;

    public void readAplicant(Scanner scanner, Aplicant aplicant){
        String nume = (scanner.next()).toString();
        aplicant.setNume(nume);
        String prenume = (scanner.next()).toString();
        aplicant.setPrenume(prenume);
        Integer varsta = Integer.valueOf(scanner.nextInt());
        aplicant.setVarsta(varsta);
        Integer punctaj = Integer.valueOf(scanner.nextInt());
        aplicant.setPunctaj(punctaj);

        Integer numar = Integer.valueOf(scanner.nextInt());
        String[] vector = new String[numar];
        for (int i = 0; i < numar; i++) {
            vector[i] = (scanner.next()).toString();
        }
    }
}
