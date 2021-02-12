package com.maltsevve.patterns.behavioral.templateMethod;

class SurgeonWorkingDay extends WorkingDayTemplate{
    @Override
    public void doWork() {
        System.out.println("Cut people");
    }
}
