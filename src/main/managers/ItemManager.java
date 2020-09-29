package main.managers;

import main.dao.ItemDao;
import main.entities.Biscuit;
import main.entities.Choclate;
import main.entities.Drinks;
import main.entities.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemManager {
    private static ItemManager itemManager;
    private ItemDao itemDao = ItemDao.getInstance();
    private List<Item> itemList= itemDao.getItemsList();
    private ItemManager() {
    }

    public static ItemManager getInstance() {
        if(itemManager==null){
            itemManager = new ItemManager();
        }
        return itemManager;
    }

    public List<Item> getItemsList() {
        return itemList;
    }

//    public List<Biscuit> getBiscuitsList() {
//        return itemDao.getBiscuitsList();
//    }
//
//    public List<Drinks> getDrinksList() {
//        return itemDao.getDrinksList();
//    }
//
//    public List<Choclate> getChoclatesList() {
//        return itemDao.getChoclatesList();
//    }

}
