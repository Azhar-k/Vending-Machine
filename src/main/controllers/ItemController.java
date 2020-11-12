package main.controllers;

import main.entities.Item;
import main.managers.ItemManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ItemController {
    private static ItemController itemController=new ItemController();
    private  ItemManager itemManager=ItemManager.getInstance();

	private List<Item> itemList=itemManager.getItemsList();

    private ItemController(){

    }

    public static ItemController getInstance(){
        return itemController;
    }

	public List<Item> getItemList(){
        return itemManager.getItemsList();
    }
}
