package com.maltsevve.patterns.behavioral.strategy;

class TaxiDriverLauncher {
    public static void main(String[] args) {
        TaxiDriver taxiDriver = new TaxiDriver();

        taxiDriver.setJob(new GoToTheCall());
        taxiDriver.executeJob();

        taxiDriver.setJob(new TakeTheClient());
        taxiDriver.executeJob();

        taxiDriver.setJob(new ExpectNewCall());
        taxiDriver.executeJob();
    }
}
