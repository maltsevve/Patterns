package com.maltsevve.patterns.structural.decorator;

class OneManBand extends MusicianDecorator {
    public OneManBand(Musician musician) {
        super(musician);
    }

    public String playALot() {
        return " Plays drums, hurdy-gurdy, violin.";
    }

    @Override
    public String playMusic() {
        return super.playMusic() + playALot();
    }
}
