package com.maltsevve.patterns.behavioral.state;

class TaxiDriverDay {
    public static void main(String[] args) {
        Job job = new GoToTheCall();
        TaxiDriver taxiDriver = new TaxiDriver();

        taxiDriver.setJob(job);

        for (int i = 0; i < 24; i++) {
            taxiDriver.toDoWork();
            taxiDriver.changeActivity();
        }
    }
}
