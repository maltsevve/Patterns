package com.maltsevve.patterns.structural.flyweight;

class Maid implements DomesticServant{
    @Override
    public void doHousework() {
        System.out.println("Maid clean the house.");
    }
}
