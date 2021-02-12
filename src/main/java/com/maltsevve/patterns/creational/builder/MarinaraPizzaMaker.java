package com.maltsevve.patterns.creational.builder;

class MarinaraPizzaMaker extends PizzaMaker{
    @Override
    void buildName() {
        pizza.setName("Marinara");
    }

    @Override
    void buildIngredients() {
        Ingredients[] ingredients = {Ingredients.SHRIMPS, Ingredients.OLIVES, Ingredients.MOZZARELLA, Ingredients.CHAMPIGNONS};
        pizza.setIngredients(ingredients);
    }

    @Override
    void buildPrice() {
        pizza.setPrice(750);
    }
}
