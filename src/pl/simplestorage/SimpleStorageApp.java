package pl.simplestorage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SimpleStorageApp {

  public static void main(String[] args) {
    
    List<Product> storage = new ArrayList<Product>();
    
    storage.add(new Milk(1, "Milk", 10, 3.2));
    storage.add(new Milk(2, "Milk", 10, 2));
    
    System.out.println("Simple Storage v.1\n");
    System.out.println("Products in stock:");
    
    storage.forEach(n -> System.out.println(n.showProduct()));
    

  }

}
