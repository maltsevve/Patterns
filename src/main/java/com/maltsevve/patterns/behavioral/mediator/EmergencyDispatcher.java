package com.maltsevve.patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

class EmergencyDispatcher implements Dispatcher{
    EmergencyService generalDispatcher;
    List<EmergencyService> emergencyServices = new ArrayList<>();

    public void setGeneralDispatcher(EmergencyService generalDispatcher) {
        this.generalDispatcher = generalDispatcher;
    }

    public void addEmergencyServices(EmergencyService emergencyService) {
        this.emergencyServices.add(emergencyService);
    }

    @Override
    public void call(String message, EmergencyService emergencyService) {
        emergencyServices.stream().filter(e -> e != emergencyService).
                forEach(emergencyService1 -> emergencyService1.getMessage(message));
        generalDispatcher.getMessage(message);
    }
}
