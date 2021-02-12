package com.maltsevve.patterns.structural.facade;

class Registry {
    boolean isPatientRegister;

    void register(String name, DegreeOfInjury degreeOfInjury){
        if (degreeOfInjury == DegreeOfInjury.MINOR) {
            if (name != null) {
                System.out.println("Registry register the patient " + name);
                isPatientRegister = true;
            } else {
                System.out.println("Which the?");
                isPatientRegister = false;
            }
        } else {
            System.out.println("Urgently take to the intensive care unit.");
            isPatientRegister = false;
        }
    }
}
