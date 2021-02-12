package com.maltsevve.patterns.creational.abstractFactory.skyscraperConstruction;

import com.maltsevve.patterns.creational.abstractFactory.*;

public class SkyscraperBuildingTeamFactory implements ConstructionTeamFactory {
    @Override
    public Architect getArchitect() {
        return new QualifiedArchitect();
    }

    @Override
    public ConstructionWorkers getConstructionWorkers() {
        return new NotSoBadConstuctionWorkers();
    }

    @Override
    public Foreman getForeman() {
        return new EliteForeman();
    }

    @Override
    public Manager getManager() {
        return new SwellManager();
    }
}
