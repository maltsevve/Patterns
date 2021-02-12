package com.maltsevve.patterns.behavioral.mediator;

class GeneralDispatcher implements EmergencyService {
    Dispatcher dispatcher;
    String name = "GeneralEmergencyDispatcher";

    public GeneralDispatcher(Dispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }

    @Override
    public void sendMessage(String message) {
        dispatcher.call(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println(this.name + " receiving message: " + message);
    }
}
