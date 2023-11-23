package com.workintech.product;

public abstract class Bread extends ProductForSale{
    public Bread(String type, int price, String description) {
        super(type, price, description);
    }
    private double weight;
}
