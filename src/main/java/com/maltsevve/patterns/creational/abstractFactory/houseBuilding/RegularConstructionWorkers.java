package com.maltsevve.patterns.creational.abstractFactory.houseBuilding;

import com.maltsevve.patterns.creational.abstractFactory.ConstructionWorkers;

class RegularConstructionWorkers implements ConstructionWorkers {
    @Override
    public void pretendsToBeWorking() {
        System.out.println("Construction workers doing something, perhaps even useful.");
    }
}
