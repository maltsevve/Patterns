package com.maltsevve.patterns.behavioral.state;

class GoToTheCall implements Job{
    @Override
    public void toDoWork() {
        System.out.println("Go after the client.");
    }
}
