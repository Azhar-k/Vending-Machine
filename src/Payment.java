//Azhar k
//azharazvtp@gmail.com

import java.util.ArrayList;
import java.util.Scanner;

public class Payment {

	
	public boolean processPayment(int totalAmount,int insertedMoney)
	{
		//get the details of selected item
		
		Scanner scanner=new Scanner(System.in);
		while(insertedMoney<totalAmount)
		{
	 		
	 		System.out.println("Sorry ! Insufficient Money...please add Rs."+(totalAmount-insertedMoney));
	 		int moreMoney=scanner.nextInt();
	 		insertedMoney+=moreMoney;
		}
		System.out.println("You have balance Rs."+(insertedMoney-totalAmount));
		return true;
	}
}
