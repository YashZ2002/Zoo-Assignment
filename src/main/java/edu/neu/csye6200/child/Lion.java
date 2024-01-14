package edu.neu.csye6200.child;

import edu.neu.csye6200.parent.AnimalAPI;

public class Lion extends AnimalAPI {

	@Override
	public void sound() {
        System.out.println("Lion Sound!!!!!(AnimalAPI)");
    }

	@Override
	public String toString() {
		return "Lion toString!!!";
	} 
	
}
