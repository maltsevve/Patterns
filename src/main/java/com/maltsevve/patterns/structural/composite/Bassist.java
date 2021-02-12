package com.maltsevve.patterns.structural.composite;

class Bassist implements Musician {
    @Override
    public void playMusic() {
        System.out.println("Bassist plays quietly in the corner of the stage.");
    }
}
