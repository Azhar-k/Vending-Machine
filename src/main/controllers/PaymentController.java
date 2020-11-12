package main.controllers;//Azhar k
//azharazvtp@gmail.com

import java.util.ArrayList;
import java.util.Scanner;

public class PaymentController {

	private static PaymentController paymentController = new PaymentController();


	private PaymentController(){

	}
	public static PaymentController getInstance(){
		return paymentController;
	}


	public boolean processPayment(int totalAmount) {
		return true;
	}
}
