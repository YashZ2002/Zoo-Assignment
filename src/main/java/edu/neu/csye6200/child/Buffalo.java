package edu.neu.csye6200.child;
import edu.neu.csye6200.parent.AbstractAnimalAPI;

public class Buffalo extends AbstractAnimalAPI{

	@Override
	public void sound() {
		System.out.println("Buffalo Sound!!!(AbstractAnimalAPI)");
	}

	@Override
	public String toString() {
		return "Buffalo toString!!!";
	}

	
}
