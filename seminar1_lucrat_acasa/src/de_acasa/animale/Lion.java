package de_acasa.animale;

public class Lion extends Animal{
    //leul mosteneste animal

    public Lion(String name, int age, String mancareSpecifica) {
        super(name, age, mancareSpecifica);
    }

    @Override
    public void eat() {
        System.out.println("Leul " + super.name + " mananca " + super.mancareSpecifica);
    }

    @Override
    public String toString() {
        return "Leul " + super.name + ", cu varsta de " + super.age;
    }

}
