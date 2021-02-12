package com.maltsevve.patterns.structural.adapter;

class AdapterSurgeonToDoctor extends Surgeon implements Doctor{
    @Override
    public void treats() {
        performSurgicalOperation();
    }
}
