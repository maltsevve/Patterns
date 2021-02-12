package com.maltsevve.patterns.structural.bridge;

class Forklift implements LoadingEquipment {
    @Override
    public void load() {
        System.out.println("Loading with a forklift.");
    }
}
