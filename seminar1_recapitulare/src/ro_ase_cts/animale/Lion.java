package ro_ase_cts.animale;

public class Lion extends Animal{
    private Double weight;

    public Lion(String name, int age, String food, Double weight) {
        super(name, age, food);
        this.weight = weight;
    }

    public Lion(Double weight) {
        this.weight = weight;
    }

    public void eat(String food, String nume){
        System.out.println(nume + " gives " + food + " to the lion, to eat.");
    }
}
