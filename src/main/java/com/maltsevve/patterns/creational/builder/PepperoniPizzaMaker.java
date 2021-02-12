package com.maltsevve.patterns.creational.builder;

class PepperoniPizzaMaker extends PizzaMaker{
    @Override
    void buildName() {
        pizza.setName("Marinara");
    }

    @Override
    void buildIngredients() {
        Ingredients[] ingredients = {Ingredients.PEPPERONI, Ingredients.MOZZARELLA, Ingredients.JALAPENO, Ingredients.TOMATOES};
        pizza.setIngredients(ingredients);
    }

    @Override
    void buildPrice() {
        pizza.setPrice(650);
    }
}
