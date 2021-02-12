package com.maltsevve.patterns.structural.decorator;

class Singer implements Musician {
    @Override
    public String playMusic() {
        return "Sing a song.";
    }
}
