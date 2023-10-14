package org.lewickiy;

public class Dog {
    private final int legsCount;
    private final String sound;

    public Dog() {
        legsCount = 4;
        sound = "Гав";
    }

    public Dog(int legsCount, String sound) {
        this.legsCount = legsCount;
        this.sound = sound;
    }

    public Dog createHalfDog() {
        return new Dog(2, "Я самый весёлый");
    }

    public int getLegsCount() {
        return legsCount;
    }
}
