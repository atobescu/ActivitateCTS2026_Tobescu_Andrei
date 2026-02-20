package ro_ase_cts.animale;

public class Otter extends Animal{
    private String tipMediu;

    @Override
    public void eat(String food, String name) {
        System.out.println("Ingrijitorul sa dea de mancare la vidra " + super.name + " cu " + super.food);
    }

    public Otter(String name, int age, String food, String tipMediu) {
        super(name, age, food);
        this.tipMediu = tipMediu;
    }

    public Otter(String tipMediu) {
        this.tipMediu = tipMediu;
    }
}
