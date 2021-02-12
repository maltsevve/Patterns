package com.maltsevve.patterns.behavioral.state;

class ExpectNewCall implements Job{
    @Override
    public void toDoWork() {
        System.out.println("Eat / doze / wait for a new call.");
    }
}
