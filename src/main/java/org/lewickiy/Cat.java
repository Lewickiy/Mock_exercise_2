package org.lewickiy;

public class Cat {
    private final int legsCount;
    private final String sound;

    public Cat() {
        legsCount = 4;
        sound = "Мяу";
    }

    public Cat(int legsCount, String sound) {
        this.legsCount = legsCount;
        this.sound = sound;
    }

    public Cat createHalfCat() {
        return new Cat(2, "Я самый умный");
    }

    public int getLegsCount() {
        return legsCount;
    }
}
