package ro.ase.cts.composite;

public class Sectie implements Structure{
    private String name;
    private Integer nEmployees;

    public Sectie(String name) {
        this.name = name;
    }

    @Override
    public void showStructureDetails() {

    }
}
