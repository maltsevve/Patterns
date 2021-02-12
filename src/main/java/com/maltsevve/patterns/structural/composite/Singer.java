package com.maltsevve.patterns.structural.composite;

class Singer implements Musician {
    @Override
    public void playMusic() {
        System.out.println("Singer sing a song and yells sometimes.");
    }
}
