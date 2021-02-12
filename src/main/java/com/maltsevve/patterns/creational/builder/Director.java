package com.maltsevve.patterns.creational.builder;

// Нужен для того чтобы использовать любую реализацию абстрактного класса PizzaMaker
class Director {
    PizzaMaker pizzaMaker;

    public void setPizzaMaker(PizzaMaker pizzaMaker) {
        this.pizzaMaker = pizzaMaker;
    }

    Pizza buildPizza() {
        pizzaMaker.makePizza();
        pizzaMaker.buildName();
        pizzaMaker.buildIngredients();
        pizzaMaker.buildPrice();

        Pizza pizza = pizzaMaker.getPizza();

        return pizza;
    }
}
