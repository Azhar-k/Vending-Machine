package main.entities;

public class Biscuit extends Item {
    private double weight;

    public Biscuit(long id, String name, int price, double weight,int count) {
        super(id, name, price,count);
        this.weight = weight;
    }
}
