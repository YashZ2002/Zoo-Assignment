package edu.neu.csye6200.child;
import edu.neu.csye6200.parent.AnimalAPI;

public class Cheeta extends AnimalAPI {

	@Override
	public void sound() {
        System.out.println("Cheeta Sound!!!!!(AnimalAPI)");
    }

	@Override
	public String toString() {
		return "Cheeta toString!!!";
	} 

}

