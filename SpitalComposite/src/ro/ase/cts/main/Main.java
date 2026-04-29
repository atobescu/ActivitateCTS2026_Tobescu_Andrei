package ro.ase.cts.main;

import ro.ase.cts.composite.Department;
import ro.ase.cts.composite.Sectie;
import ro.ase.cts.composite.Structure;

public class Main {
    public static void main(String[] args) {
        Structure hospitalDep = new Department("Spital");
        Structure administrationDep = new Department("Administratie");

        Structure managementSection = new Sectie("Management");

        ((Department)administrationDep).addStructure(managementSection);
        hospitalDep.showStructureDetails();
    }
}