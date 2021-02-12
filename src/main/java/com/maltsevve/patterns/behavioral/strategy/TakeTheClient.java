package com.maltsevve.patterns.behavioral.strategy;

import com.maltsevve.patterns.behavioral.state.Job;

class TakeTheClient implements Job {
    @Override
    public void toDoWork() {
        System.out.println("Take the client to the address.");
    }
}
