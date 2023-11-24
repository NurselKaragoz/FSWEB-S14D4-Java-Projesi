package com.workintech.monster;

public class Werewolf extends Monster {
    public Werewolf(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double attact() {
        return getDamage()+bleed();
    }

    @Override
    public double getDamage() {
        return super.getDamage();
    }

    @Override
    public double bleed() {
        return 0;
    }

    @Override
    public double poison() {
        return 0;
    }
}
