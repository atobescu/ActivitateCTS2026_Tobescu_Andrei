package ro_ase_cts.zoo;

import ro_ase_cts.animale.Animal;

import java.util.ArrayList;
import java.util.List;

public class ZOO {
    private String name;
    private ZooKeeper zooKeeper;
    private List<Animal> listaAnimale;

    public ZOO() {
        this.name = "";
        this.zooKeeper = new ZooKeeper();
        this.listaAnimale = new ArrayList<>();
    }

    public ZOO(String name, ZooKeeper zooKeeper, List<Animal> listaAnimale) {
        this.name = name;
        this.zooKeeper = zooKeeper;
        this.listaAnimale = listaAnimale;
    }

    public void adaugaAnimale(){
        //to do
    }

    public void feedAllAnimals(){
        for (Animal animal:listaAnimale){
            //animal.eat(animal);
        }

    }

}
