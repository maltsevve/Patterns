package com.maltsevve.patterns.behavioral.visitor;

class Iron implements Appliances{
    @Override
    public void usedBy(FamilyMember familyMember) {
        familyMember.use(this);
    }
}
