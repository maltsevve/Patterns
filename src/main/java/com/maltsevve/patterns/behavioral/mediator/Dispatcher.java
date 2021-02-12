package com.maltsevve.patterns.behavioral.mediator;

public interface Dispatcher {
    void call(String message, EmergencyService emergencyService);
}
