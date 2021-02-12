package com.maltsevve.patterns.creational.prototype;

class CopyCatRunner {
    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik", 7, 23);
        System.out.println(barsik);

        CatFactory factory = new CatFactory(barsik);
        Cat barsikClone = factory.cloneCat();

        System.out.println(barsikClone);
    }
}
