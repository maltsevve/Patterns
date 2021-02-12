package com.maltsevve.patterns.creational.builder;

class MakePizzaLauncher {
    public static void main(String[] args) {
        Director director = new Director();

        director.setPizzaMaker(new MarinaraPizzaMaker());
        Pizza pizza = director.buildPizza();
        System.out.println(pizza);

        director.setPizzaMaker(new PepperoniPizzaMaker());
        pizza = director.buildPizza();
        System.out.println(pizza);
    }
}
