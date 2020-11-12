package main.entities;

public class Drinks extends Item {
    private int volume;

    public Drinks(long id, String name, int price, int volume,int count) {
        super(id, name, price,count);
        this.volume = volume;
    }
}
