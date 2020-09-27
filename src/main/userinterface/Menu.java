package main.userinterface;

import main.entities.Item;

import java.util.List;
import java.util.Scanner;

public class Menu {
    Scanner scanner=new Scanner(System.in);


    public void displayItems(List<Item> itemList)
    {
        System.out.println("\n Availabe Items in the main.entities.Store\n");
        for(int i=0;i<itemList.size();i++)
        {
            System.out.println("Id :"+ itemList.get(i).getId());
            System.out.println("Name :"+ itemList.get(i).getName());
            System.out.println("price :"+itemList.get(i).getPrice());
            System.out.println("Available Count :"+itemList.get(i).getCount());

            System.out.println();
        }

    }

    public int askUserInputSelectedItemId(){
        //Ask the user to select an item
        System.out.println("Enter the id of the item you need : ");
        return scanner.nextInt();

    }
    public int askUserInputSelectedItemCount(){
        //Ask the user to enter the quantity of item needed .
        System.out.println("Please Enter the count you needed : ");
        return scanner.nextInt();
    }



    public boolean askForPayment(int totalAmount)
    {
        //get the details of selected item

        Scanner scanner=new Scanner(System.in);
        System.out.println("Insert Rs "+totalAmount+" :");
        int insertedMoney =scanner.nextInt();
        while(insertedMoney<totalAmount)
        {

            System.out.println("Sorry ! Insufficient Money...please add Rs."+(totalAmount-insertedMoney));
            int moreMoney=scanner.nextInt();
            insertedMoney+=moreMoney;
        }
        System.out.println("You have balance Rs."+(insertedMoney-totalAmount));
        return true;
    }

    public String askTocontinueWithAvailableQuantity(){
        System.out.println("do you want to continue with available quantity ? (y/n) ");
        String ch = scanner.next();
        return ch;
    }


}
