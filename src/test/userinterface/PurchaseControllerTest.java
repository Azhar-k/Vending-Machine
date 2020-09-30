package test.userinterface;

import main.controllers.PurchaseController;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PurchaseControllerTest {
    PurchaseController purchaseController;
    private int selectedItemId,getSelectedItemCount;

    @Test
    public void validateQuantityWithInvalidQuantity(){
        selectedItemId=6;
        getSelectedItemCount=100;
       purchaseController= new PurchaseController(selectedItemId,getSelectedItemCount);
       purchaseController.validateQuantity();
       assertFalse(purchaseController.getIsQuantityAvailable());
    }

    @Test
    public void validateQuantityWithvalidQuantity(){
        selectedItemId=6;
        getSelectedItemCount=10;
        purchaseController= new PurchaseController(selectedItemId,getSelectedItemCount);
        purchaseController.validateQuantity();
        assertTrue(purchaseController.getIsQuantityAvailable());
    }

    @Test
    public void validatePayment(){
        selectedItemId=6;
        getSelectedItemCount=10;
        purchaseController= new PurchaseController(selectedItemId,getSelectedItemCount);
        purchaseController.validatePayment();
        assertTrue(purchaseController.getIsPaymentDone());
    }
    @Test
    public void validateDeductItem(){
        selectedItemId=6;
        getSelectedItemCount=10;
        purchaseController= new PurchaseController(selectedItemId,getSelectedItemCount);
        purchaseController.setPurchasableQuantity(10);
        purchaseController.deductItem();
        assertTrue(purchaseController.getIsQuantityDeducted());
    }


}
