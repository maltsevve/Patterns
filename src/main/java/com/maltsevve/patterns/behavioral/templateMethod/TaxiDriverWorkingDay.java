package com.maltsevve.patterns.behavioral.templateMethod;

class TaxiDriverWorkingDay extends WorkingDayTemplate{
    @Override
    public void doWork() {
        System.out.println("Transport people.");
    }
}
