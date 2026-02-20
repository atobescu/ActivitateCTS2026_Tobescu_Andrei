package ro_ase_cts.zoo;

import ro_ase_cts.animale.Animal;

public class ZooKeeper {
    private String name;
    private String food;

    private void feedAnimal(Animal animal){
        animal.eat(food, name);
    }
}
