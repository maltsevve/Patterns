package com.maltsevve.patterns.creational.abstractFactory.skyscraperConstruction;

import com.maltsevve.patterns.creational.abstractFactory.Foreman;

class EliteForeman implements Foreman {
    @Override
    public void SwearLoudly() {
        System.out.println("Foreman monitors the building, motivates construction workers very hard.");
    }
}
