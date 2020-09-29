package main.userinterface;

import main.controllers.ItemController;
import main.controllers.PurchaseController;
import main.entities.Item;

import java.util.List;
import java.util.Scanner;

public class UIController {
    ItemController itemController=ItemController.getInstance();
    PurchaseController purchaseController ;
    Menu menu = new Menu();

    int selectedItemId;
    int selectedQuantity;

    List<Item> itemList = itemController.getItemList();

    public int getSelectedItemId() {
        return this.selectedItemId;
    }

    public void setSelectedItemId(int selectedItemId) {
        this.selectedItemId = selectedItemId;
    }

    public int getSelectedQuantity() {
        return this.selectedQuantity;
    }

    public void setSelectedQuantity(int selectedQuantity) {
        this.selectedQuantity = selectedQuantity;
    }

    public void startActivity()
    {
        String choice;
        do
        {
            menu.displayItems(itemList);
            this.setSelectedItemId(menu.askUserInputSelectedItemId());
            this.setSelectedQuantity(menu.askUserInputSelectedItemCount());
            purchase(this.getSelectedItemId(),this.getSelectedQuantity());

            System.out.println("Do you want another purchase ?(yes/no) : ");
            Scanner scanner=new Scanner(System.in);
            choice=scanner.next();
        }while(choice.equals("yes"));


    }

    public void purchase(int selectedItemId,int selectedQuantity){
        purchaseController=new PurchaseController(selectedItemId,selectedQuantity);

        purchaseController.validateQuantity();
        if(purchaseController.getIsQuantityAvailable()){
            //if quantity is validated, ask for payment
            menu.askForPayment(purchaseController.getPurchasableQuantity()*itemList.get(purchaseController.getSelectedItemId()).getPrice());
            purchaseController.validatePayment();
            if(purchaseController.getIsPaymentDone()){
                purchaseController.deductItem();
                if(purchaseController.getIsQuantityDeducted()){
                    System.out.println("Purchase successfull");
                }
                else{
                    System.out.println("Purchase failed.Please try again");
                }
            }
            else{
                System.out.println("Payment failed");
            }
        }
        else{
            System.out.println("desired quantity is not available. Available quantity is : "+purchaseController.getPurchasableQuantity());
            String ch = menu.askTocontinueWithAvailableQuantity();
            if(ch.equalsIgnoreCase("y")){
                this.setSelectedQuantity(purchaseController.getPurchasableQuantity());
                purchase(this.getSelectedItemId(),this.getSelectedQuantity());
            }
        }
    }
}
