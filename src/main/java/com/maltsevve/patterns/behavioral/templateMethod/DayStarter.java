package com.maltsevve.patterns.behavioral.templateMethod;

class DayStarter {
    public static void main(String[] args) {
        WorkingDayTemplate taxiDriverWorkingDay = new TaxiDriverWorkingDay();
        WorkingDayTemplate surgeonWorkingDay = new SurgeonWorkingDay();

        taxiDriverWorkingDay.dailyRoutine();

        System.out.println("\n=================================================\n");

        surgeonWorkingDay.dailyRoutine();
    }
}
