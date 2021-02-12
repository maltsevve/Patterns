package com.maltsevve.patterns.behavioral.visitor;

class Mother implements FamilyMember{
    @Override
    public void use(Iron iron) {
        System.out.println("Ironing clothes for herself and the child.");
    }

    @Override
    public void use(Refrigerator refrigerator) {
        System.out.println("Fills refrigerator with groceries and ready meals.");
    }

    @Override
    public void use(WashingMachine washingMachine) {
        System.out.println("Loads dirty laundry / takes out clean laundry and hangs it up.");
    }
}
