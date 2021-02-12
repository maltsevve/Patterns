package com.maltsevve.patterns.creational.singleton;

class Launcher {
    public static void main(String[] args) {
        Earth.getEarth().showAge();
        Earth.getEarth().addAge(1);
        Earth.getEarth().showAge();
    }
}
