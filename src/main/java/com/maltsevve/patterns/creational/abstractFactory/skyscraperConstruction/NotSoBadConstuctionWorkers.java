package com.maltsevve.patterns.creational.abstractFactory.skyscraperConstruction;

import com.maltsevve.patterns.creational.abstractFactory.ConstructionWorkers;

class NotSoBadConstuctionWorkers implements ConstructionWorkers {
    @Override
    public void pretendsToBeWorking() {
        System.out.println("Workers do some work, even don't make too many mistakes.");
    }
}
