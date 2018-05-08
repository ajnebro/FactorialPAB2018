package org.uma.pab2018.mocking;

public interface Store {
  boolean areThereEnoughProducts(String productName, int amount) ;
  void removeProducts(String productName, int amount) ;
}
