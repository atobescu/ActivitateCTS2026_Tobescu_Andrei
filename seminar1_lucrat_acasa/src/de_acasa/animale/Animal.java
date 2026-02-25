package de_acasa.animale;

public abstract class Animal {
    protected String name;
    protected int age;
    protected String mancareSpecifica;

    public void eat(){

    }

    public Animal(String name, int age, String mancareSpecifica) {
        this.name = name;
        this.age = age;
        this.mancareSpecifica = mancareSpecifica;
    }

    @Override
    public String toString() {
        return "Animalul " + name + ", cu varsta de " + age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMancareSpecifica() {
        return mancareSpecifica;
    }

    public void setMancareSpecifica(String mancareSpecifica) {
        this.mancareSpecifica = mancareSpecifica;
    }
}
