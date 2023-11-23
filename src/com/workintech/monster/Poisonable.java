package com.workintech.monster;

public interface Poisonable {
    default double poison(){
        return 0;
    }
}
