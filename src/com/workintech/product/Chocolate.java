package com.workintech.product;

public abstract class Chocolate extends ProductForSale{
    public Chocolate(String type, int price, String description) {
        super(type, price, description);
    }
    private String type;
}
