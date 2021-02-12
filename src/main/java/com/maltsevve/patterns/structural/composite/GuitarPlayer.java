package com.maltsevve.patterns.structural.composite;

class GuitarPlayer implements Musician {
    @Override
    public void playMusic() {
        System.out.println("Guitarist playing riff. It's fucking tasty!");
    }
}
