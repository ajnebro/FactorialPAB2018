package org.uma.pab2018.mocking;

public class PurchaseOrder {
  private String productName ;
  private int amount ;

  public PurchaseOrder(String productName, int amount) {
    this.productName = productName ;
    this.amount = amount ;
  }

  public void buy(Store store) {
    if (store.areThereEnoughProducts(productName, amount)) {
      store.removeProducts(productName, amount);
    }
  }
}
