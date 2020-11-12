package test.userinterface;

import main.Database.Database;
import main.controllers.ItemController;
import main.entities.Item;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ItemControllerTest {

    ItemController itemController;

    @Test
    public void getItemList(){

        itemController = ItemController.getInstance();

        List<Item> expected = Database.getInstance().getItemsList();
        List<Item> actual = itemController.getItemList();

        assertEquals(expected,actual);
    }
}
