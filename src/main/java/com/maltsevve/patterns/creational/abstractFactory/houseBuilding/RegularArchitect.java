package com.maltsevve.patterns.creational.abstractFactory.houseBuilding;

import com.maltsevve.patterns.creational.abstractFactory.Architect;

class RegularArchitect implements Architect {
    @Override
    public void copiesTheOldProject() {
        System.out.println("Architect make new project with old problems and without any idea.");
    }
}
