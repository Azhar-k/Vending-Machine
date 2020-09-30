package main.userinterface;

import main.entities.Item;

import java.util.List;

public interface Menu {
    public void displayItems(List<Item> itemList);
    public int askUserInputSelectedItemId();
    public int askUserInputSelectedItemCount();
    public boolean askForPayment(int totalAmount);
    public String askTocontinueWithAvailableQuantity();
}
