package edu.neu.csye6200.child;

import edu.neu.csye6200.parent.AbstractAnimalAPI;

public class Goat extends AbstractAnimalAPI {
	
	@Override
	public void sound() {
		System.out.println("Goat Sound!!!(AbstractAnimalAPI)");
	}

	@Override
	public String toString() {
		return "Goat toString!!!";
	}

}
