package test.userinterface;

import main.userinterface.UIController;
import org.junit.*;
import org.junit.Before;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UIControllerTest {
    private int selectedItemIdInputFromUser,selectedItemCountInputFromUser;
    private boolean paymentInputFromUser,continueWithAvailableQuantityInputFromUser,continueAnotherPurchaseInputFromUSer;

    @Before
    public void init(){

    }
    @Test
    public void purchaseWithValidQuantity(){
        selectedItemCountInputFromUser = 10;
        selectedItemIdInputFromUser =6;
        paymentInputFromUser = true;
        continueWithAvailableQuantityInputFromUser = true;
        continueAnotherPurchaseInputFromUSer=true;
        UIController uiController=new UIController(new MenuImpMock(
                selectedItemIdInputFromUser,
                selectedItemCountInputFromUser,
                paymentInputFromUser,
                continueWithAvailableQuantityInputFromUser,
                continueAnotherPurchaseInputFromUSer));
       assertTrue(uiController.purchase(selectedItemIdInputFromUser,selectedItemCountInputFromUser));
    }
    @Test
    public void purchaseWithInValidQuantityAndUserProceed(){
        selectedItemCountInputFromUser = 100;
        selectedItemIdInputFromUser =6;
        paymentInputFromUser = true;
        continueWithAvailableQuantityInputFromUser = true;
        continueAnotherPurchaseInputFromUSer=true;
        UIController uiController=new UIController(new MenuImpMock(
                selectedItemIdInputFromUser,
                selectedItemCountInputFromUser,
                paymentInputFromUser,
                continueWithAvailableQuantityInputFromUser, continueAnotherPurchaseInputFromUSer));
        assertFalse(uiController.purchase(selectedItemIdInputFromUser,selectedItemCountInputFromUser));
    }
    @Test
    public void purchaseWithInValidQuantityAndUserTerminate(){
        selectedItemCountInputFromUser = 100;
        selectedItemIdInputFromUser =6;
        paymentInputFromUser = true;
        continueWithAvailableQuantityInputFromUser = false;
        continueAnotherPurchaseInputFromUSer=true;
        UIController uiController=new UIController(new MenuImpMock(
                selectedItemIdInputFromUser,
                selectedItemCountInputFromUser,
                paymentInputFromUser,
                continueWithAvailableQuantityInputFromUser,
                continueAnotherPurchaseInputFromUSer));
        assertFalse(uiController.purchase(selectedItemIdInputFromUser,selectedItemCountInputFromUser));
    }

    @Test
    public void startActivityTest(){
        selectedItemCountInputFromUser = 100;
        selectedItemIdInputFromUser =6;
        paymentInputFromUser = true;
        continueWithAvailableQuantityInputFromUser = false;
        continueAnotherPurchaseInputFromUSer=false;
        UIController uiController=new UIController(new MenuImpMock(
                selectedItemIdInputFromUser,
                selectedItemCountInputFromUser,
                paymentInputFromUser,
                continueWithAvailableQuantityInputFromUser,
                continueAnotherPurchaseInputFromUSer));
        uiController.startActivity();

    }

}
