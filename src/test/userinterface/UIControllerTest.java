package test.userinterface;

import main.userinterface.MenuImp;
import main.userinterface.UIController;
import org.junit.*;
import org.junit.Before;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UIControllerTest {
    UIController uiController ;
    @Before
    public void init(){
        uiController=new UIController(new MenuImpMock());
    }
    @Test
    public void purchaseWithValidQuantity(){

       assertTrue(uiController.purchase(6,10));
    }
    @Test
    public void purchaseWithInValidQuantity(){

        assertFalse(uiController.purchase(6,100));
    }

}
