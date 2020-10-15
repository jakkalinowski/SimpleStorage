package pl.simplestorage;

public class Rake extends Product{
  
  // product fields
  private RakeType rakeType = RakeType.NONE;
  
  // constructor 
  public Rake(int productId, String productName, int productQty, String rakeType) {
    super(productId, productName, productQty);
    this.rakeType = RakeType.valueOf(rakeType);
  }
  
  // getters and setters
  public RakeType getRakeType() {
    return rakeType;
  }

  public void setRakeType(RakeType rakeType) {
    this.rakeType = rakeType;
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
    return "Id: " + this.getProductId() + " \t Name: " + this.getProductName() + " \t Type: " + this.getRakeType() + " \t\t Qty: " + this.getProductQty();
  }

}
