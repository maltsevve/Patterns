package com.maltsevve.patterns.creational.abstractFactory.skyscraperConstruction;

import com.maltsevve.patterns.creational.abstractFactory.Manager;

class SwellManager implements Manager {
    @Override
    public void doingMainManagersWork() {
        System.out.println("Swell manager gracefully wriggles out of all the problems that the team and himself create.");
    }
}
