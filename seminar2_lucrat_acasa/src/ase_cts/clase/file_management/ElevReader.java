package ase_cts.clase.file_management;

import ase_cts.clase.Angajat;
import ase_cts.clase.Aplicant;
import ase_cts.clase.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElevReader extends Readers {
    @Override
    public List<Aplicant> readAplicanti(String file) throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(file));
        input2.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<Aplicant>();

        while (input2.hasNext()) {
            Elev elev = new Elev();
            super.readAplicant(input2, elev);

            int clasa = input2.nextInt();
            elev.setClasa(clasa);
            String tutore = input2.next();
            elev.setTutore(tutore);
            elevi.add(elev);
        }

        input2.close();
        return elevi;
    }
}
