package main.dao;

import main.Database.Database;
import main.entities.Item;

import java.util.List;

public class ItemDao {
    private static ItemDao itemDao = new ItemDao();
    private Database database = Database.getInstance();

    private ItemDao() {
    }

    public static ItemDao getInstance(){
        return itemDao;
    }
    public List<Item> getItemsList() {
        return database.getItemsList();
    }

    public boolean deductItem(int selectedItemId, int quantity){
        return database.deductItem(selectedItemId,quantity);

    }

//    public List<Biscuit> getBiscuitsList() {
//        return database.getBiscuitsList();
//    }
//
//    public List<Drinks> getDrinksList() {
//        return database.getDrinksList();
//    }
//
//    public List<Choclate> getChoclatesList() {
//        return database.getChoclatesList();
//    }


}
