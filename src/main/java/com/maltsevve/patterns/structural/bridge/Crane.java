package com.maltsevve.patterns.structural.bridge;

class Crane implements LoadingEquipment {
    @Override
    public void load() {
        System.out.println("Loading with a crane.");
    }
}
