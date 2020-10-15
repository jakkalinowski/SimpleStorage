package pl.simplestorage;

public interface Storage {
  
  // increase product quantity
  public void addQty(int productQty);
  
  // decrease product quantity
  public void removeQty(int productQty);
  
  // show product full description
  public String showProduct();

}
