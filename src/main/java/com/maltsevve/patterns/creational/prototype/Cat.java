package com.maltsevve.patterns.creational.prototype;

class Cat implements Copyable{
    String name;
    int age;
    int tailLength;

    public Cat(String name, int age, int tailLength) {
        this.name = name;
        this.age = age;
        this.tailLength = tailLength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTailLength() {
        return tailLength;
    }

    public void setTailLength(int tailLength) {
        this.tailLength = tailLength;
    }

    @Override
    public Object copy() {
        Cat copy = new Cat(name, age, tailLength);
        return copy;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", tailLength=" + tailLength +
                '}';
    }
}
