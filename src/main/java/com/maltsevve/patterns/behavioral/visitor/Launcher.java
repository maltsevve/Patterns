package com.maltsevve.patterns.behavioral.visitor;

class Launcher {
    public static void main(String[] args) {
        House house = new House();

        FamilyMember mother = new Mother();
        FamilyMember father = new Father();
        FamilyMember child = new Child();

        System.out.println("Mother's activity:");
        house.usedBy(mother);

        System.out.println("\n===========================================\n");

        System.out.println("Father's activity:");
        house.usedBy(father);

        System.out.println("\n===========================================\n");

        System.out.println("Child activity:");
        house.usedBy(child);
    }
}
