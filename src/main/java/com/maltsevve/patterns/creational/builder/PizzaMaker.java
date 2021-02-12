package com.maltsevve.patterns.creational.builder;

public abstract class PizzaMaker {
    Pizza pizza;

    void makePizza() {
        pizza = new Pizza();
    }

    abstract void buildName();

    abstract void buildIngredients();

    abstract void buildPrice();

    Pizza getPizza() {
        return pizza;
    }
}
