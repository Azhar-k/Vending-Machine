//Azhar k
//azharazvtp@gmail.com

import java.util.ArrayList;
import java.util.Scanner;

public class Store {
	static ArrayList<Item> itemList =new ArrayList();
	
	
	public ArrayList<Item> getItemList()
	{
		
		//Load the itemList
		itemList.add(new Item(0,"Biscuit","20-20",20,100));
		itemList.add(new Item(1,"Biscuit","Good Day",30,50));
		itemList.add(new Item(2,"Biscuit","Hide and Seek",10,0));
		
		itemList.add(new Item(3,"Drinks","Pepsi",35,200));
		itemList.add(new Item(4,"Drinks","7 up ",25,150));
		
		itemList.add(new Item(5,"Chocolates","Galaxy",50,100));
		itemList.add(new Item(6,"Chocolates","Diary Milk",20,70));
		
		
		return itemList;
		
	}
	public static boolean updateStock(int selectedItem,int quantity,ArrayList<Item> itemList)
	{
		//update the count of item in database
		int count=itemList.get(selectedItem).getCount();
		count=count-quantity;
		itemList.get(selectedItem).setCount(count);
		return true;
		
	}
	
	public static int validateQuantity(int selectedItem,ArrayList<Item> itemList,int quantity)
	{
		if(itemList.get(selectedItem).getCount()==0)
	 	{
	 		System.out.println("Item is out of stock ");
	 		quantity=-1;
	 		return quantity;
	 	}
		Scanner scanner=new Scanner(System.in);
		if(itemList.get(selectedItem).getCount()< quantity)
	 	{
	 		System.out.println("Sorry ! that much quantity is not available now \n  Do you want to proceed with available quantity ? (yes / no)  :");
	 		String proceed=scanner.next();
	 		if(proceed.equals("yes"))
	 		{
	 			quantity=itemList.get(selectedItem).getCount();
	 			
	 		}
	 		else
	 		{
	 			quantity=-1;
	 		}
	 		
	 	}
		return quantity;
	}
	
}
