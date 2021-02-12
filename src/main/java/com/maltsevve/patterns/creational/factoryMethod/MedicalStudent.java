package com.maltsevve.patterns.creational.factoryMethod;

class MedicalStudent implements Student{
    @Override
    public void skipTheLecture() {
        System.out.println("Medical student skip Anatomy.");
    }
}
