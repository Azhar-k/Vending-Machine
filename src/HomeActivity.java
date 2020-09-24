//Azhar k
//azharazvtp@gmail.com

import java.util.ArrayList;
import java.util.Scanner;

public class HomeActivity {

	private static ArrayList<Item> itemList=new ArrayList();
	private static int selectedItem;
	private static int insertedMoney;
	private static int quantity;
	private static Store store;
	
	//method to display the items
	private static void displayItems(ArrayList<Item> ItemList)
	{
		System.out.println("\n Availabe Items in the Store\n");
	 	for(int i=0;i<itemList.size();i++)
	 	{
	 		System.out.println("Id :"+ itemList.get(i).getId());
	 		System.out.println("Name :"+ itemList.get(i).getName());
	 		System.out.println("Type :"+ itemList.get(i).getType());
	 		System.out.println("price :"+itemList.get(i).getPrice());
	 		System.out.println("Available Count :"+itemList.get(i).getCount());
	 		
	 		System.out.println();
	 	}
	}
	
	//method to start the activities
	private static void startActivity(ArrayList<Item> itemList)
 	{
		Scanner scanner=new Scanner(System.in);
		
	 	
	 	//display the itemList
	 	displayItems(itemList);
	 	
	 	//Ask the user to select an item
	 	System.out.println("Enter the id of the item you need : ");
	 	selectedItem=scanner.nextInt();
	 	
	 	//Ask the user to enter the quantity of item needed .
	 	System.out.println("Please Enter the count you needed : ");
	 	quantity=scanner.nextInt();
	 	
	 	//validate the availability of items
	 	quantity=Store.validateQuantity(selectedItem, itemList, quantity);
	 	if(quantity==-1)
	 	{
	 		//User do not want to proceed due to lack of quantity
	 		System.out.println("You discontinued the order ");
	 		
	 	}
	 	else //Desired quantity is available
	 	{
	 		
	 		int totalAmount=itemList.get(selectedItem).getPrice()*quantity;
		 	
		 	//Ask the user to insert money and process the payment
		 	System.out.println("Please insert Rs."+totalAmount);
		 	insertedMoney=scanner.nextInt();
		 	Payment payment=new Payment();
		 	boolean pay=payment.processPayment(totalAmount, insertedMoney);
		 	
		 	if(pay)//payment is successfull
		 	{
		 		//update the stock
		 		boolean update=Store.updateStock(selectedItem,quantity,itemList);
		 		if(update)//stock update is successfull
		 		{
		 			System.out.println("Purchase is successfull ");
		 		}
		 		else
		 		{
		 			System.out.println("Purchase is unsuccessfull ");
		 		}
		 		
		 	}
		 	else
		 	{
		 		System.out.println("payment failed ");
		 	}
	 	}
	 	
	 	
	 	
	 	
	 		
	 	 
 	}

	
	//main method
	public static void main(String[] args) {
		String choice;
		store=new Store();
		itemList=store.getItemList();
	 	
		do
		{
			
			startActivity(itemList);
			
			
			System.out.println("Do you want another purchase ?(yes/no) : ");
			Scanner scanner=new Scanner(System.in);
			choice=scanner.next();
		}while(choice.equals("yes"));
	 	
	}
	

}
