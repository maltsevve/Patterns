package com.maltsevve.patterns.behavioral.strategy;

import com.maltsevve.patterns.behavioral.state.Job;

class GoToTheCall implements Job {
    @Override
    public void toDoWork() {
        System.out.println("Go after the client.");
    }
}
