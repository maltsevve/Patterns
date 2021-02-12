package com.maltsevve.patterns.behavioral.chainOfResponsibility;

public abstract class Child {
    private int levelOfProblem;
    private Child nextChild;

    public Child(int levelOfProblem) {
        this.levelOfProblem = levelOfProblem;
    }

    public void setNextChild(Child nextChild) {
        this.nextChild = nextChild;
    }

    public void callOlderBro(String scream, int screamVolume) {
        if (screamVolume >= levelOfProblem) {
            call(scream);
        }
        if (nextChild != null) {
            nextChild.callOlderBro(scream, screamVolume);
        }
    }

    public abstract void call(String scream);
}
