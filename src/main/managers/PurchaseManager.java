package main.managers;

import main.dao.ItemDao;

public class PurchaseManager {

    private static PurchaseManager purchaseManager = new PurchaseManager();

    private ItemDao itemDao = ItemDao.getInstance();

    private PurchaseManager(){

    }

    public static PurchaseManager getInstance(){
        return purchaseManager;
    }

    public boolean deductItem(int selectedItemId, int quantity){
        return itemDao.deductItem(selectedItemId,quantity);

    }
}
