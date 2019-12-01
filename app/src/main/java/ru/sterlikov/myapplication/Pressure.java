package ru.sterlikov.myapplication;

public class Pressure {

    private int upper;
    private int lower;
    private int pulse;
    private boolean tachycardia;

    public Pressure(int upper, int lower, int pulse, boolean tachycardia) {
        this.upper = upper;
        this.lower = lower;
        this.pulse = pulse;
        this.tachycardia = tachycardia;
    }

    public int getUpper() {
        return upper;
    }

    public int getLower() {
        return lower;
    }

    public int getPulse() {
        return pulse;
    }

    public boolean isTachycardia() {
        return tachycardia;
    }

}
