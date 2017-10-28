package com.sac.factory;
import java.util.List; 
import java.util.ArrayList; 

public class ShoppingCartAbsfacbean {

    private List<Product> items = new ArrayList<Product>();

    public void addItem(Product item) {
        items.add(item);
    }

    public List<Product> getItems() {
        return items;
    }
}
