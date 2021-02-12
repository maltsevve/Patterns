package com.maltsevve.patterns.behavioral.state;

class TakeTheClient implements Job{
    @Override
    public void toDoWork() {
        System.out.println("Take the client to the address.");
    }
}
