package edu.neu.csye6200.child;
import edu.neu.csye6200.parent.AnimalisticAPI;

public class Wolf implements AnimalisticAPI {
	
	@Override
    public void sound() {
        System.out.println("Wolf Sound!!!!(AnimalisticAPI)");
    }

	@Override
	public String toString() {
		return "Wolf toString!!!";
	}

}

