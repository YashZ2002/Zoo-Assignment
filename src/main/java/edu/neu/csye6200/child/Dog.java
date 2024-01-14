package edu.neu.csye6200.child;

import edu.neu.csye6200.parent.AnimalisticAPI;

public class Dog implements AnimalisticAPI {

	 @Override
	    public void sound() {
	        System.out.println("Dog Sound!!!!(AnimalisticAPI)");
	    }

	@Override
	public String toString() {
		return "Dog toString!!!";
	}

}
