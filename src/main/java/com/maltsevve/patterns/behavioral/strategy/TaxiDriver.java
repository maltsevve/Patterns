package com.maltsevve.patterns.behavioral.strategy;

import com.maltsevve.patterns.behavioral.state.Job;

class TaxiDriver {
    com.maltsevve.patterns.behavioral.state.Job job;

    public void setJob(Job job) {
        this.job = job;
    }

    public void executeJob() {
        job.toDoWork();
    }
}
