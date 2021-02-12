package com.maltsevve.patterns.creational.factoryMethod;

class FactoryMethodDemo {
    public static void main(String[] args) {
        String specialty = "medic";
        StudentFactory studentFactory = createStudentBySpecialty(specialty);
        Student student = studentFactory.createStudent();

        student.skipTheLecture();

        specialty = "economist";
        studentFactory = createStudentBySpecialty(specialty);
        student = studentFactory.createStudent();

        student.skipTheLecture();
    }

    static StudentFactory createStudentBySpecialty(String specialty) {
        if (specialty.equalsIgnoreCase("medic")) {
            return new MedicalStudentFactory();
        } else if (specialty.equalsIgnoreCase("economist")) {
            return new EconomicsStudentFactory();
        } else {
            throw new RuntimeException(specialty + " is unknown specialty.");
        }
    }
}
