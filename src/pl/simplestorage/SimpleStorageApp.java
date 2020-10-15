package pl.simplestorage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SimpleStorageApp {

  public static void main(String[] args) {
    
    List<Product> storage = new ArrayList<Product>();
    Scanner scanner = new Scanner(System.in);
    int flag = 1;
    int selector1 = 0;
    int selector2 = 0;
    
    storage.add(new Milk(1, "Milk 1", 10, 3.2));
    storage.add(new Milk(2, "Milk 2", 10, 2));
    storage.add(new Rake(3, "Rake 1", 10, "WOODEN"));
    storage.add(new Rake(4, "Rake 2", 10, "METAL"));
    
    do {
    System.out.println("Simple Storage v.1\n");
    System.out.println("Products in stock:");
    
    storage.forEach(n -> System.out.println(n.showProduct()));
    
    System.out.println("\nAction: 1) Increase quantity 2) Decrease quantity 3) Exit");
    selector1 = scanner.nextInt();
    
    if (selector1 == 1) {
      System.out.println("Input a product ID: ");
      selector1 = scanner.nextInt();
      System.out.println("Input value to increase product quantity: ");
      selector2 = scanner.nextInt();
      storage.get(selector1-1).addQty(selector2);
      selector1 = 1;
    } else if (selector1 == 2) {
      System.out.println("Input a product ID: ");
      selector1 = scanner.nextInt();
      System.out.println("Input value to decrease product quantity: ");
      selector2 = scanner.nextInt();
      storage.get(selector1-1).removeQty(selector2);
      selector1 = 2;
    } else {
      System.out.println("Bye Bye!");
      flag=0;
    } 
    } while (flag != 0);
  }

}
