package com.maltsevve.patterns.behavioral.chainOfResponsibility;

class HomeAccident {
    public static void main(String[] args) {
        Child youngerBrother = new YoungerBrother(ProblemLevel.BROKE_SOMETHING.getLevelOfProblem());
        Child middleBrother = new MiddleBrother(ProblemLevel.MINOR_INJURY.getLevelOfProblem());
        Child OlderBrother = new OlderBrother(ProblemLevel.HOUSE_ON_FIRE.getLevelOfProblem());

        youngerBrother.setNextChild(middleBrother);
        middleBrother.setNextChild(OlderBrother);

        youngerBrother.callOlderBro("Can we glue it?", ProblemLevel.BROKE_SOMETHING.getLevelOfProblem());
        System.out.println();
        youngerBrother.callOlderBro("I need a first aid kit!", ProblemLevel.MINOR_INJURY.getLevelOfProblem());
        System.out.println();
        youngerBrother.callOlderBro("Oh, shit! 'Call 911'", ProblemLevel.HOUSE_ON_FIRE.getLevelOfProblem());
    }
}
