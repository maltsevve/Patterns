package com.maltsevve.patterns.creational.factoryMethod;

class EconomicsStudent implements Student{
    @Override
    public void skipTheLecture() {
        System.out.println("Economics student skip Accounting.");
    }
}
