package ro.ase.cts.composite;

import java.util.ArrayList;
import java.util.List;

public class Department implements Structure{
    private String depName;
    private List<Structure> subStructures = new ArrayList<>();

    public void addStructure(Structure structure){
        subStructures.add(structure);
    }
    public void deleteStructure(Structure structure){
        subStructures.remove(structure);
    }

    public Department(String depName) {
        this.depName = depName;

    }

    public List<Structure> getSubStructures() {
        return subStructures;
    }

    @Override
    public void showStructureDetails() {
        System.out.println("Departament: ");
        for(Structure subStructure: this.subStructures){
            subStructure.showStructureDetails();
        }

    }

}
