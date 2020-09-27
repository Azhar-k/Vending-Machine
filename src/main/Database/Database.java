package main.Database;

import main.entities.Biscuit;
import main.entities.Choclate;
import main.entities.Drinks;
import main.entities.Item;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private static Database database = new Database();
    private static List<Item> itemsList = new ArrayList<Item>();

//    private List<Biscuit> biscuitsList = new ArrayList<Biscuit>();
//    private List<Drinks> drinksList = new ArrayList<Drinks>();
//    private List<Choclate> choclatesList = new ArrayList<Choclate>();
    private Database(){}

    public static Database getInstance(){
        loadItems();
        return database;
    }

    public static void loadItems() {
        loadDrinks();
        loadChoclates();
        loadBicuits();
    }

    private static void loadDrinks() {
//        drinksList.add(new Drinks(0, "Pepsi", 30, 550, 100));
//        drinksList.add(new Drinks(1, "7 Up", 35, 600, 50));

        itemsList.add(new Drinks(0, "Pepsi", 30, 550, 100));
        itemsList.add(new Drinks(1, "7 Up", 35, 600, 50));
    }

    private static void loadChoclates() {
//        choclatesList.add(new Choclate(0, "Galaxy", 10, 100, 20));
//        choclatesList.add(new Choclate(1, "Kitkat", 10, 100, 30));

        itemsList.add(new Choclate(2, "Galaxy", 10, 100, 20));
        itemsList.add(new Choclate(3, "Kitkat", 10, 100, 30));
    }

    private static void loadBicuits() {
//        biscuitsList.add(new Biscuit(0, "20-20", 30, 500, 50));
//        biscuitsList.add(new Biscuit(1, "Good Day", 20, 300, 60));
//        biscuitsList.add(new Biscuit(2, "Hide and Seek", 20, 200, 70));

        itemsList.add(new Biscuit(4, "20-20", 30, 500, 50));
        itemsList.add(new Biscuit(5, "Good Day", 20, 300, 60));
        itemsList.add(new Biscuit(6, "Hide and Seek", 20, 200, 70));

    }

    public List<Item> getItemsList() {
        return itemsList;
    }

    public boolean deductItem(int selectedItemId, int quantity){
        Item item = itemsList.get(selectedItemId);
        int currentCount = item.getCount();
        int updatedCount = currentCount-quantity;
        item.setCount(updatedCount);
        return true;
    }

//    public List<Biscuit> getBiscuitsList() {
//        return biscuitsList;
//    }
//
//    public List<Drinks> getDrinksList() {
//        return drinksList;
//    }
//
//    public List<Choclate> getChoclatesList() {
//        return choclatesList;
//    }
}
