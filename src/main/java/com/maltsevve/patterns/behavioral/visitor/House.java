package com.maltsevve.patterns.behavioral.visitor;

public class House implements Appliances{
    Appliances[] houseAppliances;

    public House() {
        this.houseAppliances = new Appliances[]{
                new Refrigerator(),
                new Iron(),
                new WashingMachine()
        };
    }

    @Override
    public void usedBy(FamilyMember familyMember) {
        for (Appliances appliance : houseAppliances) {
            appliance.usedBy(familyMember);
        }
    }
}
