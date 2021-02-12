package com.maltsevve.patterns.creational.abstractFactory.houseBuilding;

import com.maltsevve.patterns.creational.abstractFactory.*;

public class HouseBuildingTeamFactory implements ConstructionTeamFactory {
    @Override
    public Architect getArchitect() {
        return new RegularArchitect();
    }

    @Override
    public ConstructionWorkers getConstructionWorkers() {
        return new RegularConstructionWorkers();
    }

    @Override
    public Foreman getForeman() {
        return new RegularForeman();
    }

    @Override
    public Manager getManager() {
        return new RegularManager();
    }
}
