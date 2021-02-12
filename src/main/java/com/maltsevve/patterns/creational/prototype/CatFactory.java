package com.maltsevve.patterns.creational.prototype;

class CatFactory {
    Cat cat;

    public CatFactory(Cat cat) {
        this.cat = cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    Cat cloneCat() {
        return (Cat) cat.copy();
    }
}
