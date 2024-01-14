package edu.neu.csye6200.models;

import edu.neu.csye6200.child.Lion;

import edu.neu.csye6200.child.Cow;
import edu.neu.csye6200.child.Buffalo;
import edu.neu.csye6200.child.Cat;
import edu.neu.csye6200.child.Cheeta;
import edu.neu.csye6200.child.Tiger;
import edu.neu.csye6200.child.Wolf;
import edu.neu.csye6200.child.Goat;
import edu.neu.csye6200.child.Dog;
import edu.neu.csye6200.parent.AbstractAnimalAPI;
import edu.neu.csye6200.parent.AnimalisticAPI;
import edu.neu.csye6200.parent.AnimalAPI;

public class ZooObjectAnimals {

	public static void demo() {
		AnimalAPI animal = new AnimalAPI();
		AnimalAPI tiger = new Tiger();
		AnimalAPI lion = new Lion();
		AnimalAPI cheeta = new Cheeta();
		ZooAnimals zooAnimals = new ZooAnimals();

		AbstractAnimalAPI goat = new Goat();
		AbstractAnimalAPI cow = new Cow();
		AbstractAnimalAPI buffalo = new Buffalo();
		ZooAbstractAnimals zooAbstractAnimals = new ZooAbstractAnimals();

		AnimalisticAPI cat = new Cat();
		AnimalisticAPI dog = new Dog();
		AnimalisticAPI wolf = new Wolf();
		ZooAnimalisticAnimals zooAnimalisticAnimals = new ZooAnimalisticAnimals();

		ZooObjectAnimals zooObjectAnimals = new ZooObjectAnimals();

		// Concrete Class Child Objects
		System.out.println();
		System.out.println("------------------------------ Concrete Class ------------------------------");
		System.out.println();
		zooAnimals.makeSound(animal);
		zooAnimals.makeSound(tiger);
		zooAnimals.makeSound(lion);
		zooAnimals.makeSound(cheeta);

		// Abstract Class Child Objects
		System.out.println();
		System.out.println("------------------------------ Abstract Class ------------------------------");
		System.out.println();
		zooAbstractAnimals.makeSound(goat);
		zooAbstractAnimals.makeSound(cow);
		zooAbstractAnimals.makeSound(buffalo);

		// Interface Class Child Objects
		System.out.println();
		System.out.println("------------------------------ Interface Class -----------------------------");
		System.out.println();
		zooAnimalisticAnimals.makeSound(dog);
		zooAnimalisticAnimals.makeSound(cat);
		zooAnimalisticAnimals.makeSound(wolf);

		// Calling Child Class Objects using "explosionObjectModel"
		System.out.println();
		System.out.println("------------------------------ ZooObjectAnimals Class ----------------------");
		System.out.println();
		zooObjectAnimals.makeSound(animal);
		zooObjectAnimals.makeSound(tiger);
		zooObjectAnimals.makeSound(lion);
		zooObjectAnimals.makeSound(cheeta);
		zooObjectAnimals.makeSound(goat);
		zooObjectAnimals.makeSound(cow);
		zooObjectAnimals.makeSound(buffalo);
		zooObjectAnimals.makeSound(dog);
		zooObjectAnimals.makeSound(cat);
		zooObjectAnimals.makeSound(wolf);
		
		//Calling toString() methods of all the class
		System.out.println();
		System.out.println("------------------------------ toString ------------------------------------");
		System.out.println();
		System.out.println(animal);
		System.out.println(tiger);
		System.out.println(lion);
		System.out.println(cheeta);
		System.out.println(goat);
		System.out.println(cow);
		System.out.println(buffalo);
		System.out.println(dog);
		System.out.println(cat);
		System.out.println(wolf);

	}

	public void makeSound(Object animalSOund) {
		if (animalSOund instanceof AnimalAPI) {
			((AnimalAPI) animalSOund).sound();
		} else if (animalSOund instanceof AbstractAnimalAPI) {
			((AbstractAnimalAPI) animalSOund).sound();
		} else if (animalSOund instanceof AnimalisticAPI) {
			((AnimalisticAPI) animalSOund).sound();
		}
	}

}
