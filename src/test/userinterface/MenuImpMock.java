package test.userinterface;

import main.entities.Item;
import main.userinterface.Menu;

import java.util.List;

public class MenuImpMock implements Menu {
    private int selectedItemIdInputFromUser,selectedItemCountInputFromUser;
    private boolean paymentInputFromUser,continueWithAvailableQuantityInputFromUser,continueAnotherPurchaseInputFromUSer;

    public MenuImpMock(int selectedItemIdInputFromUser, int selectedItemCountInputFromUser, boolean paymentInputFromUser, boolean continueWithAvailableQuantityInputFromUser, boolean continueAnotherPurchaseInputFromUSer) {
        this.selectedItemIdInputFromUser = selectedItemIdInputFromUser;
        this.selectedItemCountInputFromUser = selectedItemCountInputFromUser;
        this.paymentInputFromUser = paymentInputFromUser;
        this.continueWithAvailableQuantityInputFromUser = continueWithAvailableQuantityInputFromUser;
        this.continueAnotherPurchaseInputFromUSer = continueAnotherPurchaseInputFromUSer;
    }

    public void displayItems(List<Item> itemList)
    {

    }

    public int askUserInputSelectedItemId(){

     return selectedItemIdInputFromUser;

    }
    public int askUserInputSelectedItemCount(){
       return this.selectedItemCountInputFromUser;
    }



    public boolean askForPayment(int totalAmount)
    {

       return this.paymentInputFromUser;
    }

    public boolean askTocontinueWithAvailableQuantity(){
       return this.continueWithAvailableQuantityInputFromUser;
    }

    @Override
    public boolean askUserForAnotherPurchase() {
        return continueAnotherPurchaseInputFromUSer;
    }


}
