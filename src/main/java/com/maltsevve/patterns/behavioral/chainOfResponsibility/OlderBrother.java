package com.maltsevve.patterns.behavioral.chainOfResponsibility;

class OlderBrother extends Child{
    public OlderBrother(int levelOfProblem) {
        super(levelOfProblem);
    }

    @Override
    public void call(String scream) {
        System.out.println("Older brother swear: " + scream);
    }
}
