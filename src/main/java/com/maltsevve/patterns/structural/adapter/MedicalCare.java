package com.maltsevve.patterns.structural.adapter;

class MedicalCare {
    public static void main(String[] args) {
        Doctor doctor = new AdapterSurgeonToDoctor();

        doctor.treats();
    }
}
