package com.maltsevve.patterns.behavioral.visitor;

class Refrigerator implements Appliances{
    @Override
    public void usedBy(FamilyMember familyMember) {
        familyMember.use(this);
    }
}
