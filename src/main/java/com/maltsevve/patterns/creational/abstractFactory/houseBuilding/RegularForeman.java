package com.maltsevve.patterns.creational.abstractFactory.houseBuilding;

import com.maltsevve.patterns.creational.abstractFactory.Foreman;

class RegularForeman implements Foreman {
    @Override
    public void SwearLoudly() {
        System.out.println("Foreman motivates the construction team to work.");
    }
}
