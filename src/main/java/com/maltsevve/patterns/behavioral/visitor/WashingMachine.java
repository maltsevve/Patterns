package com.maltsevve.patterns.behavioral.visitor;

class WashingMachine implements Appliances{
    @Override
    public void usedBy(FamilyMember familyMember) {
        familyMember.use(this);
    }
}
