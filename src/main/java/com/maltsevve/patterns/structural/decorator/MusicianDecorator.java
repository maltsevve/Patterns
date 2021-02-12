package com.maltsevve.patterns.structural.decorator;

class MusicianDecorator implements Musician{
    Musician musician;

    public MusicianDecorator(Musician musician) {
        this.musician = musician;
    }

    @Override
    public String playMusic() {
        return musician.playMusic();
    }
}
