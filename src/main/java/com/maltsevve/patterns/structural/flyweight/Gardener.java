package com.maltsevve.patterns.structural.flyweight;

class Gardener implements DomesticServant{
    @Override
    public void doHousework() {
        System.out.println("Gardener look after the garden.");
    }
}
