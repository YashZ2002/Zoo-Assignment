package edu.neu.csye6200.child;

import edu.neu.csye6200.parent.AbstractAnimalAPI;

public class Cow extends AbstractAnimalAPI{

	@Override
	public void sound() {
		System.out.println("Cow Sound!!!(AbstractAnimalAPI)");
	}

	@Override
	public String toString() {
		return "Cow toString!!!";
	}

}
