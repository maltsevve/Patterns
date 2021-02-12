package com.maltsevve.patterns.behavioral.visitor;

public interface FamilyMember {
    void use(Iron iron);

    void use(Refrigerator refrigerator);

    void use(WashingMachine washingMachine);
}
