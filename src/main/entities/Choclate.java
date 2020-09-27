package main.entities;

public class Choclate extends Item {
    private double weight;

    public Choclate(long id, String name, int price, double weight,int count) {
        super(id, name, price,count);
        this.weight = weight;
    }
}
