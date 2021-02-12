package com.maltsevve.patterns.creational.builder;

import java.util.Arrays;

class Pizza {
    private String name;
    private Ingredients[] ingredients;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setIngredients(Ingredients[] ingredients) {
        this.ingredients = ingredients;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", ingredients=" + Arrays.toString(ingredients) +
                ", price=" + price +
                '}';
    }
}
