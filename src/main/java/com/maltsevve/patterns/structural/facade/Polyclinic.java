package com.maltsevve.patterns.structural.facade;

class Polyclinic {
    Injured injured;
    Registry registry = new Registry();
    Physician physician = new Physician();

    public Polyclinic(Injured injured) {
        this.injured = injured;
    }

    public void provideMedicalAssistance() {
        registry.register(injured.name, injured.degreeOfInjury);
        physician.PatientExamination(registry);
    }
}
