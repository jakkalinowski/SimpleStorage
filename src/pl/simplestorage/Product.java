package pl.simplestorage;

public abstract class Product implements Storage {
  
  private int productId = 0;
  private String productName ="";
  private int productQty = 0;
  
  public Product(int productId, String productName, int productQty)  {
    this.productId = productId;
    this.productName = productName;
    this.productQty = productQty;
  }

  public int getProductId() {
    return productId;
  }

  public void setProductId(int productId) {
    this.productId = productId;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public int getProductQty() {
    return productQty;
  }
  
  public void setProductQty(int productQty) {
    this.productQty = productQty;
  }
  
  public String showProduct() {
    return "Id: " + this.getProductId() + " Name: " + this.getProductName() + " " + " Qty: " + this.getProductQty();
  }

}
