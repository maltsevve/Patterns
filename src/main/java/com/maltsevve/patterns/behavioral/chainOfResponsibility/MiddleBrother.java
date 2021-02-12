package com.maltsevve.patterns.behavioral.chainOfResponsibility;

class MiddleBrother extends Child{
    public MiddleBrother(int levelOfProblem) {
        super(levelOfProblem);
    }

    @Override
    public void call(String scream) {
        System.out.println("Middle brother yell: " + scream);
    }
}
