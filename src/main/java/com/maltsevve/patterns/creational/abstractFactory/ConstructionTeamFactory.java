package com.maltsevve.patterns.creational.abstractFactory;

public interface ConstructionTeamFactory {
    Architect getArchitect();
    ConstructionWorkers getConstructionWorkers();
    Foreman getForeman();
    Manager getManager();
}
