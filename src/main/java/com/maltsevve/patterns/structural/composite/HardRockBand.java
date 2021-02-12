package com.maltsevve.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

class HardRockBand {
    private List<Musician> musicians = new ArrayList<>();

    public void addMusician(Musician musician) {
        musicians.add(musician);
    }

    public void removeMusician(Musician musician) {
        musicians.remove(musician);
    }

    public void playMusic() {
        System.out.println("C'mon, Kage, bring the thundah!");
        musicians.forEach(Musician::playMusic);
    }
}
