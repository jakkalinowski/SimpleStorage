package pl.simplestorage;

public class Milk extends Product {
  
  // product fields
  private double fatValue = 0;
  
  // constructor
  Milk(int productId, String productName, int productQty, double fatValue) {
    super(productId, productName, productQty);
    this.fatValue = fatValue;
  }
  
  // getters and setters
  public double getFatValue() {
    return fatValue;
  }

  public void setFatValue(double fatValue) {
    this.fatValue = fatValue;
  }

  // override Storage interface methods
  
  // increase product quantity
  @Override
  public void addQty(int productQty) {
    this.setProductQty(this.getProductQty()+productQty);
  }

  // decrease product quantity
  @Override
  public void removeQty(int productQty) {
    this.setProductQty(this.getProductQty()-productQty);
  }
  
  // show product full description
  @Override
  public String showProduct() {
    return "Id: " + this.getProductId() + " \t Name: " + this.getProductName() + " \t Fat value: " + this.getFatValue() + " \t Qty: " + this.getProductQty();
  }


}
