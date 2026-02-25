package de_acasa.pachetZoo;

import de_acasa.animale.Animal;
import de_acasa.animale.Lion;

import java.util.List;

public class ZooKeeper {
    private String nume;

    public void feedAnimal(Animal animal){
        System.out.println("Ingrijitorul " + nume + " da de mancare la " + animal.toString()+". Animalul " + animal.getName() + " mananca " + animal.getMancareSpecifica());
    }

    public ZooKeeper() {
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
