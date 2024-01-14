package edu.neu.csye6200.child;

import edu.neu.csye6200.parent.AnimalisticAPI;

public class Cat implements AnimalisticAPI {
	
	@Override
    public void sound() {
        System.out.println("Cat Sound!!!!(AnimalisticAPI)");
    }

	@Override
	public String toString() {
		return "Cat toString!!!";
	}
	
	

}
