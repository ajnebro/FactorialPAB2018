package org.uma.pab2018.mocking;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class PurchaseOrderTest {

  @Test
  public void shouldBuyRemoveTheProductInTheStoreIfThereAreEnoughItems() {
    // Init
    Store store = mock(Store.class) ;

    // Stubbing
    when(store.areThereEnoughProducts("Shirt", 20)).thenReturn(true) ;

    // Execute
    PurchaseOrder purchaseOrder = new PurchaseOrder("Shirt", 20) ;
    purchaseOrder.buy(store) ;

    // Verify
    verify(store).removeProducts("Shirt", 20);
  }

  @Test
  public void shouldBuyNotRemoveTheProductInTheStoreIfThereAreNotEnoughItems() {
    // Init
    Store store = mock(Store.class) ;

    // Stubbing
    when(store.areThereEnoughProducts("Shirt", 20)).thenReturn(false) ;

    // Execute
    PurchaseOrder purchaseOrder = new PurchaseOrder("Shirt", 20) ;
    purchaseOrder.buy(store) ;

    // Verify
    verify(store, never()).removeProducts("Shirt", 20);
  }

  @Test
  public void shouldBuyWorkIfThereAreProductsTheFirstTimeButNotTheSeconeOne() {
    // Init
    Store store = mock(Store.class) ;

    // Stubbing
    when(store.areThereEnoughProducts("Shirt", 20))
            .thenReturn(true, false) ;

    // Execute
    PurchaseOrder purchaseOrder = new PurchaseOrder("Shirt", 20) ;
    purchaseOrder.buy(store) ;
    purchaseOrder.buy(store) ;

    // Verify
    verify(store, times(2)).areThereEnoughProducts("Shirt", 20) ;
    verify(store, times(1)).removeProducts("Shirt", 20);
  }
}