package com.maltsevve.patterns.creational.abstractFactory.skyscraperConstruction;

import com.maltsevve.patterns.creational.abstractFactory.Architect;

class QualifiedArchitect implements Architect {
    @Override
    public void copiesTheOldProject() {
        System.out.println("Qualified architect significantly recycles the old project.");
    }
}
