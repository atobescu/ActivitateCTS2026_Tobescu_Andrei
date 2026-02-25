package de_acasa.pachetZoo;

import de_acasa.animale.Animal;

import java.util.ArrayList;
import java.util.List;

public class ZOO {
    //se foloseste de Animal si ZooKeeper
    private String name;
    private ZooKeeper zooKeeper;
    private List<Animal> animals;

    public void feedAllAnimals(){
        for(Animal a:animals){
            zooKeeper.feedAnimal(a);
        }
    }

    public ZOO(String name, ZooKeeper zooKeeper, List<Animal> animals) {
        this.name = name;
        this.zooKeeper = zooKeeper;
        this.animals = animals;
    }

    public ZOO() {
        this.name = "-";
        this.zooKeeper = new ZooKeeper();
        this.animals = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ZooKeeper getZooKeeper() {
        return zooKeeper;
    }

    public void setZooKeeper(ZooKeeper zooKeeper) {
        this.zooKeeper = zooKeeper;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

}
