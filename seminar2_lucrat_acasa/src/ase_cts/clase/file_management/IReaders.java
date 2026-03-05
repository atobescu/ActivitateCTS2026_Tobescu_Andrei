package ase_cts.clase.file_management;

import ase_cts.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;

public interface IReaders {
    public List<Aplicant> readAplicanti(String file) throws FileNotFoundException;
}
