package com.maltsevve.patterns.creational.abstractFactory;

import com.maltsevve.patterns.creational.abstractFactory.houseBuilding.HouseBuildingTeamFactory;

class CountryHouse {
    public static void main(String[] args) {
        ConstructionTeamFactory constructionTeamFactory = new HouseBuildingTeamFactory();
        Manager manager = constructionTeamFactory.getManager();
        Architect architect = constructionTeamFactory.getArchitect();
        Foreman foreman = constructionTeamFactory.getForeman();
        ConstructionWorkers constructionWorkers = constructionTeamFactory.getConstructionWorkers();

        manager.doingMainManagersWork();
        architect.copiesTheOldProject();
        foreman.SwearLoudly();
        constructionWorkers.pretendsToBeWorking();
        manager.doingMainManagersWork();
    }
}
