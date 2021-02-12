package com.maltsevve.patterns.behavioral.visitor;

class Father implements FamilyMember{
    @Override
    public void use(Iron iron) {
        System.out.println("Ironing clothes for himself sometimes.");
    }

    @Override
    public void use(Refrigerator refrigerator) {
        System.out.println("Consumes food and alcohol from the refrigerator.");
    }

    @Override
    public void use(WashingMachine washingMachine) {
        System.out.println("Sometimes hangs up clean laundry.");
    }
}
