package org.lewickiy;

public class CatDog {
    private final int legsCount;
    private final String sound;

    public CatDog(Cat cat, Dog dog) {
        this.legsCount = countLegs(cat.getLegsCount(), dog.getLegsCount());
        this.sound = "Единственный в мире малыш Котопёс";
    }

    public int countLegs(int catLegs, int dogLegs) {
        return catLegs + dogLegs;
    }

    public int getLegsCount() {
        return legsCount;
    }

    public String getSound() {
        return sound;
    }
}
