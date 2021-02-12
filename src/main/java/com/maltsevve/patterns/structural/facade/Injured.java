package com.maltsevve.patterns.structural.facade;

class Injured {
    String name;

    DegreeOfInjury degreeOfInjury;

    public Injured(String name, DegreeOfInjury degreeOfInjury) {
        this.name = name;
        this.degreeOfInjury = degreeOfInjury;
    }
}
