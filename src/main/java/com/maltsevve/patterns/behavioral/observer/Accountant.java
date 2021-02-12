package com.maltsevve.patterns.behavioral.observer;

import java.util.List;

class Accountant implements Observer{
    String name;

    public Accountant(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> taxClauses) {
        System.out.println("Dear " + name + "\nThere have been changes in tax legislation:\n" + taxClauses +
                "\n=========================================================================\n");
    }
}
