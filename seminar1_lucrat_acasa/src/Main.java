import de_acasa.animale.Animal;
import de_acasa.animale.Lion;
import de_acasa.animale.Zebra;
import de_acasa.pachetZoo.ZOO;
import de_acasa.pachetZoo.ZooKeeper;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ZOO zoo = new ZOO();
        ZooKeeper ingrijitor = new ZooKeeper();
        ingrijitor.setNume("Ion");
        zoo.setZooKeeper(ingrijitor);

        //Animale:
        Lion leu1 = new Lion("John",10, "carne de orice fel");
        Lion leu2 = new Lion("Marco",1, "carne de orice fel");
        Lion leu3 = new Lion("Julien",20, "carne de orice fel");
        Zebra zebra1 = new Zebra("Marcus", 5, "Fan");
        Zebra zebra2 = new Zebra("Marcus2", 5, "Fan");
        Zebra zebra3 = new Zebra("Marcus3", 5, "Fan");

        List<Animal> listaAnimale = new ArrayList<>();
        listaAnimale.add(leu1);
        listaAnimale.add(leu2);
        listaAnimale.add(leu3);
        listaAnimale.add(zebra1);
        listaAnimale.add(zebra2);
        listaAnimale.add(zebra3);

        zoo.setAnimals(listaAnimale);

        ingrijitor.feedAnimal(leu1);
        zoo.feedAllAnimals();

    }
}