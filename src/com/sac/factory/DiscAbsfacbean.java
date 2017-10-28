package com.sac.factory;

public class DiscAbsfacbean extends Product {

    private int capacity;

    public DiscAbsfacbean() {
        super();
    }

    public DiscAbsfacbean(String name, double price) {
        super(name, price);
    }

    // Getters and Setters
    public void setCapacity(int capacity) { 
	this.capacity = capacity;
    } 
     
    public int getCapacity() { 
	return capacity;
    }
}
