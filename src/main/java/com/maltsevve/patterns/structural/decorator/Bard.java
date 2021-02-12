package com.maltsevve.patterns.structural.decorator;

class Bard extends MusicianDecorator{
    public Bard(Musician musician) {
        super(musician);
    }

    public String playGuitar() {
        return " Play the guitar.";
    }

    @Override
    public String playMusic() {
        return super.playMusic() + playGuitar();
    }
}
