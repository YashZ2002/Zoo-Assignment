package edu.neu.csye6200.models;

import edu.neu.csye6200.parent.AnimalAPI;

public class ZooAnimals {
	public void makeSound(AnimalAPI animal) {
        animal.sound();
    }

	@Override
	public String toString() {
		return "ZooAnimals toString";
	}

}
