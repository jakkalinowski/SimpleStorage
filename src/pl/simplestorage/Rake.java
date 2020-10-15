package pl.simplestorage;

public class Rake extends Product implements Storage{
  
  private RakeType rakeType = RakeType.NONE;
  

  public Rake(int productId, String productName, int productQty, String rakeType) {
    super(productId, productName, productQty);
    this.rakeType = RakeType.valueOf(rakeType);
  }
  
  public RakeType getRakeType() {
    return rakeType;
  }

  public void setRakeType(RakeType rakeType) {
    this.rakeType = rakeType;
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
    return "Id: " + this.getProductId() + " \t Name: " + this.getProductName() + " \t Type: " + this.getRakeType() + " \t\t Qty: " + this.getProductQty();
  }

}
