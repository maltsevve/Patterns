package com.maltsevve.patterns.creational.factoryMethod;

class MedicalStudentFactory implements StudentFactory{
    @Override
    public Student createStudent() {
        return new MedicalStudent();
    }
}
