package de_acasa.animale;

public class Zebra extends Animal{
    //zebra mosteneste animal
    public Zebra(String name, int age, String mancareSpecifica) {
        super(name, age, mancareSpecifica);
    }

    @Override
    public void eat() {
        System.out.println("Zebra " + super.name + " mananca " + super.mancareSpecifica);
    }

    @Override
    public String toString() {
        return "Zebra " + super.name + ", cu varsta de " + super.age;
    }
}
