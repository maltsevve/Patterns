package com.maltsevve.patterns.behavioral.templateMethod;

public abstract class WorkingDayTemplate {
    public void dailyRoutine() {
        System.out.println("Wake up / wash / have breakfast / go to work");
        doWork();
        System.out.println("Buy groceries / read news / have dinner / ... ");
    }

    public abstract void doWork();
}
