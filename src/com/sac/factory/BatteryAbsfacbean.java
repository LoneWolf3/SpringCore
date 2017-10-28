package com.sac.factory;

public class BatteryAbsfacbean extends Product {

    private boolean rechargeable;

    public BatteryAbsfacbean() {
        super();
    }

    public BatteryAbsfacbean(String name, double price) {
        super(name, price);
    }

    // Getters and Setters
    public void setRechargeable(boolean rechargeable) { 
	this.rechargeable = rechargeable;
    } 
     
    public boolean getRechargeable() { 
	return rechargeable;
    }
}
