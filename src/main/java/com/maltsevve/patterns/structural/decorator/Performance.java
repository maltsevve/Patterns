package com.maltsevve.patterns.structural.decorator;

class Performance {
    public static void main(String[] args) {
        Musician musician = new Singer();
        System.out.println(musician.playMusic());

        musician = new Bard(new Singer());
        System.out.println(musician.playMusic());

        musician = new OneManBand(new Bard(new Singer()));
        System.out.println(musician.playMusic());
    }
}
