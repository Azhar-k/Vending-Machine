package main.controllers;

import main.entities.Item;
import main.managers.PurchaseManager;

import java.util.List;

public class PurchaseController {

    private ItemController itemController = ItemController.getInstance();
    private PaymentController paymentController = PaymentController.getInstance();
    private PurchaseManager purchaseManager = PurchaseManager.getInstance();

    List<Item> itemList = itemController.getItemList();

    private int selectedItemId;
    private int requiredQuantity;
    private int purchasableQuantity;
    private int totalAmount;

    private boolean isQuantityAvailable;
    private boolean isPaymentDone;
    private  boolean isQuantityDeducted;


    public PurchaseController(int selectedItemId,int requiredQuantity){
        this.selectedItemId = selectedItemId;
        this.requiredQuantity = requiredQuantity;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public int getRequiredQuantity() {
        return requiredQuantity;
    }
    public int getSelectedItemId() {
        return selectedItemId;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public boolean getIsQuantityAvailable() {
        return isQuantityAvailable;
    }

    public void setIsQuantityAvailable(boolean isQuantityAvailable) {
        this.isQuantityAvailable = isQuantityAvailable;
    }

    public boolean getIsPaymentDone() {
        return isPaymentDone;
    }

    public void setIsPaymentDone(boolean isPaymentDone) {
        this.isPaymentDone = isPaymentDone;
    }

    public boolean getIsQuantityDeducted() {
        return isQuantityDeducted;
    }

    public void setIsQuantityDeducted(boolean isquantityDeducted) {
        isQuantityDeducted = isquantityDeducted;
    }


    public int getPurchasableQuantity() {
        return purchasableQuantity;
    }

    public void setPurchasableQuantity(int purchasableQuantity) {
        this.purchasableQuantity = purchasableQuantity;
    }

    public void validateQuantity(){
        int availableQuantity=itemList.get(selectedItemId).getCount();

        if(this.getRequiredQuantity()<=availableQuantity){
            this.setPurchasableQuantity(requiredQuantity);
            this.setIsQuantityAvailable(true);
        }
        else{
            this.setPurchasableQuantity(availableQuantity);
            this.setIsQuantityAvailable(false);
        }
    }

    public void validatePayment(){
        int totalAmount = this.getPurchasableQuantity()*itemList.get(this.getSelectedItemId()).getPrice();
        this.setTotalAmount(totalAmount);
        this.setIsPaymentDone(paymentController.processPayment(totalAmount));
    }
    public void deductItem(){
        this.setIsQuantityDeducted(purchaseManager.deductItem(this.getSelectedItemId(),this.getPurchasableQuantity()));

    }
}
