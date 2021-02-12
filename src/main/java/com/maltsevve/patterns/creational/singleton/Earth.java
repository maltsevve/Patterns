package com.maltsevve.patterns.creational.singleton;

public class Earth {
    private static Earth earth;
    private static int age = 454_000_000;

    public static synchronized Earth getEarth() {
        if (earth == null) {
            earth = new Earth();
        }

        return earth;
    }

    private Earth() {

    }

    public void addAge(int year) {
        age += year;
    }

    public void showAge() {
        System.out.printf("The age of the Earth %,d +/- 50 000 000\n", age);
    }
}
