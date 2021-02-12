package com.maltsevve.patterns.behavioral.chainOfResponsibility;

class YoungerBrother extends Child{
    public YoungerBrother(int levelOfProblem) {
        super(levelOfProblem);
    }

    @Override
    public void call(String scream) {
        System.out.println("Younger brother thought: " + scream);
    }
}
