package ro_ase_cts.animale;

public abstract class Animal {
    protected String name;
    protected int age;
    protected String food;

    public void eat(String food, String name){

    }
    //merita sa faci atributele protected daca:...
    //principiul yarni: you are not gonna need it

    public Animal(String name, int age, String food) {
        this.name = name;
        this.age = age;
        this.food = food;
    }
    //cand adaugi un atribut, e recomandat sa lasi constructorul asa, dar sa faci altul cu toti parametrii,
    //daca ramanea constructorul asta, trebuia sa modifici zebra si leu
    //refactoring = sa modifici codul manual
    //cand vrei sa modifici afisarea, modifici direct in clasa care face functia cu afisarea (e simplu)

    //dupa ce faci diagrama, vine altcineva si vrea sa adauge o vidra

    public Animal() {
        this.name = "";
        this.age = 0;
    }
}
