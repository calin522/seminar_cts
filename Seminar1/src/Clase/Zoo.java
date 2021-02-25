package Clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private Zookeeper zookeeper;
    private List<Animal> animals;


    public Zoo(Zookeeper zookeeper, List<Animal> animals) {
        this.zookeeper = zookeeper;
        this.animals = animals;
    }

    public Zoo() {
        this.zookeeper = new Zookeeper("Ionel");
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal){
        animals.add(animal);
    }
    
    public void feedAllAnimals() {
    	for(Animal a : this.animals) 
    	{
    		zookeeper.feed(a);
    	}
    }
}