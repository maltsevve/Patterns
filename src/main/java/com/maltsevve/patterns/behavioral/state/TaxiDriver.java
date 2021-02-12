package com.maltsevve.patterns.behavioral.state;

class TaxiDriver {
    Job job;

    public void setJob(Job job) {
        this.job = job;
    }

    public void changeActivity() {
        if (job instanceof GoToTheCall) {
            setJob(new TakeTheClient());
        } else if (job instanceof TakeTheClient) {
            setJob(new ExpectNewCall());
        } else if (job instanceof ExpectNewCall) {
            setJob(new GoToTheCall());
        }
    }

    public void toDoWork() {
        job.toDoWork();
    }
}
