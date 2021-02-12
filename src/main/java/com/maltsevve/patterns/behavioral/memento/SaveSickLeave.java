package com.maltsevve.patterns.behavioral.memento;

import java.util.Date;

class SaveSickLeave {
    private final String name;
    private final int age;
    private final Date date;

    public SaveSickLeave(String name, int age) {
        this.name = name;
        this.age = age;
        this.date = new Date();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Date getDate() {
        return date;
    }
}
