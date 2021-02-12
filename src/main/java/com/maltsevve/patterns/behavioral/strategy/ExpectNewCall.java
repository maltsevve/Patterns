package com.maltsevve.patterns.behavioral.strategy;

import com.maltsevve.patterns.behavioral.state.Job;

class ExpectNewCall implements Job {
    @Override
    public void toDoWork() {
        System.out.println("Eat / doze / wait for a new call.");
    }
}
