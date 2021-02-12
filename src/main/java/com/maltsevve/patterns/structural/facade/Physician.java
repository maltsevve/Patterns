package com.maltsevve.patterns.structural.facade;

class Physician {
    void PatientExamination(Registry registry) {
        if (registry.isPatientRegister) {
            System.out.println("Physician diagnoses, schedule tests, send to a specialized doctor.");
        } else {
            System.out.println("Physician ask: \"how did you get here without registration?\"");
        }
    }
}
