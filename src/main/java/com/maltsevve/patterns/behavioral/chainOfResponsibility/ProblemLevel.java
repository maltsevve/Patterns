package com.maltsevve.patterns.behavioral.chainOfResponsibility;

public enum ProblemLevel {
    BROKE_SOMETHING(1),
    MINOR_INJURY(2),
    HOUSE_ON_FIRE(3);

    private final int levelOfProblem;

    ProblemLevel(int levelOfProblem) {
        this.levelOfProblem = levelOfProblem;
    }

    public int getLevelOfProblem() {
        return levelOfProblem;
    }
}
