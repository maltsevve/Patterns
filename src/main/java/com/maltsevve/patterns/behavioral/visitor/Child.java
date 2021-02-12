package com.maltsevve.patterns.behavioral.visitor;

class Child implements FamilyMember{
    @Override
    public void use(Iron iron) {
        System.out.println("Does not touch the iron.");
    }

    @Override
    public void use(Refrigerator refrigerator) {
        System.out.println("Consumes goodies from the refrigerator.");
    }

    @Override
    public void use(WashingMachine washingMachine) {
        System.out.println("Sometimes hangs up clean laundry.");
    }
}
