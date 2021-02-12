package com.maltsevve.patterns.behavioral.mediator;

class EmergencyRunner {
    public static void main(String[] args) {
        EmergencyDispatcher emergencyDispatcher = new EmergencyDispatcher();

        EmergencyService generalDispatcher = new GeneralDispatcher(emergencyDispatcher);
        EmergencyService ambulance = new Ambulance(emergencyDispatcher, "Ambulance #18");
        EmergencyService police = new Police(emergencyDispatcher, "Police department #132");

        emergencyDispatcher.setGeneralDispatcher(generalDispatcher);
        emergencyDispatcher.addEmergencyServices(ambulance);
        emergencyDispatcher.addEmergencyServices(police);

        generalDispatcher.sendMessage("Emergency in the main square");
        ambulance.sendMessage("Ambulance is sent to the main square");
        police.sendMessage("Patrol cars are sent to the main square");
    }
}
