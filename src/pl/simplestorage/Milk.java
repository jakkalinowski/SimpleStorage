package pl.simplestorage;

public class Milk extends Product implements Storage {
  
  private double fatValue = 0;
  
  Milk(int productId, String productName, int productQty, double fatValue) {
    super(productId, productName, productQty);
    this.fatValue = fatValue;
  }
  
  public double getFatValue() {
    return fatValue;
  }

  public void setFatValue(double fatValue) {
    this.fatValue = fatValue;
  }

  @Override
  public void addQty(int productQty) {
    this.setProductQty(this.getProductQty()+productQty);
  }

  @Override
  public void removeQty(int productQty) {
    this.setProductQty(this.getProductQty()-productQty);
  }
  
  @Override
  public String showProduct() {
    return "Id: " + this.getProductId() + " \t Name: " + this.getProductName() + " \t Fat value: " + this.getFatValue() + " \t Qty: " + this.getProductQty();
  }


}
