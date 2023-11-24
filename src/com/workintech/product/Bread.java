package com.workintech.product;

public class Bread extends ProductForSale{
    public Bread(String type, int price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {

    }

    private double weight;
}
