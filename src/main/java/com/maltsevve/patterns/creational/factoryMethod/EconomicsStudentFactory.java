package com.maltsevve.patterns.creational.factoryMethod;

class EconomicsStudentFactory implements StudentFactory{
    @Override
    public Student createStudent() {
        return new EconomicsStudent();
    }
}
