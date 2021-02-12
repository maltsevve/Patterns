package com.maltsevve.patterns.creational.abstractFactory;

import com.maltsevve.patterns.creational.abstractFactory.skyscraperConstruction.SkyscraperBuildingTeamFactory;

class SuperSkyscraper {
    public static void main(String[] args) {
        ConstructionTeamFactory constructionTeamFactory = new SkyscraperBuildingTeamFactory();

        Manager manager = constructionTeamFactory.getManager();
        Architect architect = constructionTeamFactory.getArchitect();
        Foreman foreman = constructionTeamFactory.getForeman();
        ConstructionWorkers constructionWorkers = constructionTeamFactory.getConstructionWorkers();

        architect.copiesTheOldProject();
        foreman.SwearLoudly();
        constructionWorkers.pretendsToBeWorking();
        manager.doingMainManagersWork();
    }
}
