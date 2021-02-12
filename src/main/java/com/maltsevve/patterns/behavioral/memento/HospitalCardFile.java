package com.maltsevve.patterns.behavioral.memento;

class HospitalCardFile {
    private SaveSickLeave save;

    public SaveSickLeave getSave() {
        return save;
    }

    public void setSave(SaveSickLeave save) {
        this.save = save;
    }
}
