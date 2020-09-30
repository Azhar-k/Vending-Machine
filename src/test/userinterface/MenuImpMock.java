package test.userinterface;

import main.entities.Item;
import main.userinterface.Menu;

import java.util.List;
import java.util.Scanner;

public class MenuImpMock implements Menu {
    Scanner scanner=new Scanner(System.in);


    public void displayItems(List<Item> itemList)
    {

    }

    public int askUserInputSelectedItemId(){

     return 6;

    }
    public int askUserInputSelectedItemCount(){
       return 10;
    }



    public boolean askForPayment(int totalAmount)
    {

       return true;
    }

    public String askTocontinueWithAvailableQuantity(){
       return "y";
    }


}
