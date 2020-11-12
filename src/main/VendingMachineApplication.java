package main;//Azhar k
//azharazvtp@gmail.com

import main.userinterface.MenuImp;
import main.userinterface.UIController;

public class VendingMachineApplication {
	static MenuImp menu = new MenuImp();
	static UIController uiController = new UIController(menu);
	//main method
	public static void main(String[] args) {
		uiController.startActivity();
	}
	

}
