package edu.neu.csye6200.models;

import edu.neu.csye6200.parent.AbstractAnimalAPI;

public class ZooAbstractAnimals {
	public void makeSound(AbstractAnimalAPI abstractAnimal) {
		abstractAnimal.sound();
    }

	@Override
	public String toString() {
		return "ZooAbstractAnimals toString";
	}

}
