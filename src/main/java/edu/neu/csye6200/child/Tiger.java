package edu.neu.csye6200.child;

import edu.neu.csye6200.parent.AnimalAPI;

public class Tiger extends AnimalAPI {

	@Override
	public void sound() {
        System.out.println("Tiger Sound!!!!!(AnimalAPI)");
    }

	@Override
	public String toString() {
		return "Tiger toString!!!";
	} 

}
