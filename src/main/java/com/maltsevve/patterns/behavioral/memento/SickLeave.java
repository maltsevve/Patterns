package com.maltsevve.patterns.behavioral.memento;

import java.util.Date;

class SickLeave {
    private String name;
    private int age;
    private Date date;

    public void setNameAgeDate(String name, int age) {
        this.name = name;
        this.age = age;
        date = new Date();
    }

    public SaveSickLeave save() {
        return new SaveSickLeave(name, age);
    }

    public void load(SaveSickLeave save) {
        name = save.getName();
        age = save.getAge();
        date = save.getDate();
    }

    @Override
    public String toString() {
        return "SickLeave:" +
                "\nname=" + name +
                "\nage=" + age +
                "\ndate=" + date + "\n";
    }
}
