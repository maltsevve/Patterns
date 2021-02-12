package com.maltsevve.patterns.creational.abstractFactory.houseBuilding;

import com.maltsevve.patterns.creational.abstractFactory.Manager;

class RegularManager implements Manager {
    @Override
    public void doingMainManagersWork() {
        System.out.println("Manager lies to customers.");
    }
}
