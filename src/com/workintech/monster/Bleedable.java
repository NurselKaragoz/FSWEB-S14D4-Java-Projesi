package com.workintech.monster;

public interface Bleedable {
    default double bleed(){

        return 0;
    }
}
