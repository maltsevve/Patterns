package com.maltsevve.patterns.structural.composite;

class MusicalProject {
    public static void main(String[] args) {
        HardRockBand hardRockBand = new HardRockBand();

        Musician singer = new Singer();
        Musician guitarPlayer = new GuitarPlayer();
        Musician bassist = new Bassist();
        Musician drummer  = new Drummer();

        hardRockBand.addMusician(singer);
        hardRockBand.addMusician(guitarPlayer);
        hardRockBand.addMusician(bassist);
        hardRockBand.addMusician(drummer);

        hardRockBand.playMusic();
    }
}
